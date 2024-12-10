package br.com.telemedicina.service;

import br.com.telemedicina.dto.ConsultaRequestDTO;
import br.com.telemedicina.dto.ConsultaResponseDTO;
import br.com.telemedicina.model.Clinica;
import br.com.telemedicina.model.Consulta;
import br.com.telemedicina.model.Medico;
import br.com.telemedicina.model.Paciente;
import br.com.telemedicina.repository.ClinicaRepository;
import br.com.telemedicina.repository.ConsultaRepository;
import br.com.telemedicina.repository.MedicoRepository;
import br.com.telemedicina.repository.PacienteRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ConsultaService {

    private final ConsultaRepository consultaRepository;
    private final MedicoRepository medicoRepository;
    private final PacienteRepository pacienteRepository;
    private final ClinicaRepository clinicaRepository;

    public ConsultaService(ConsultaRepository consultaRepository, MedicoRepository medicoRepository, PacienteRepository pacienteRepository, ClinicaRepository clinicaRepository) {
        this.consultaRepository = consultaRepository;
        this.medicoRepository = medicoRepository;
        this.pacienteRepository = pacienteRepository;
        this.clinicaRepository = clinicaRepository;
    }

    //Listar as consultas
    public List<ConsultaResponseDTO> getAllConsulta() {
        List<Consulta> consultas = consultaRepository.findAll();
        return consultas.stream()
                .map(this::toConsultaResponseDTO)
                .collect(Collectors.toList());
    }

    //Buscar consulta pelo ID
    public ConsultaResponseDTO getConsultaById(Integer id) {
        Consulta consulta = consultaRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Consulta não encontrado."));
        return toConsultaResponseDTO(consulta);
    }

    //Cadastrar uma consulta
    public ConsultaResponseDTO cadastrarConsulta(ConsultaRequestDTO requestDTO) {
        if(requestDTO.getPacienteId() == null || requestDTO.getMedicoId() == null || requestDTO.getClinicaId() == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "IDs de paciente, médico e clinica são obrigatórios.");
        }

        Paciente paciente = pacienteRepository.findById(requestDTO.getPacienteId())
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Paciente não encontrado."));
        Medico medico = medicoRepository.findById(requestDTO.getMedicoId())
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Médico não encontrado."));
        Clinica clinica = clinicaRepository.findById(requestDTO.getClinicaId())
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Clinica não econtrada."));

        Consulta consulta = new Consulta();
        consulta.setDataConsulta(requestDTO.getDataConsulta());
        consulta.setFormatoConsulta(requestDTO.getFormatoConsulta());
        consulta.setPagamentoConsulta(requestDTO.getPagamentoConsulta());
        consulta.setAreaProcura(requestDTO.getAreaProcura());
        consulta.setPaciente(paciente);
        consulta.setMedico(medico);
        consulta.setClinica(clinica);

        Consulta consultaSalva = consultaRepository.save(consulta);

        return new ConsultaResponseDTO(
                consultaSalva.getId(),
                consultaSalva.getDataConsulta(),
                consultaSalva.getFormatoConsulta(),
                consultaSalva.getPagamentoConsulta(),
                consultaSalva.getAreaProcura(),
                paciente.getNome(),
                medico.getNomeMed(),
                clinica.getNomeClinica()
        );
    }

    //Atualizar uma consulta
    public ConsultaResponseDTO atualizarConsulta(Integer id, ConsultaRequestDTO requestDTO) {
        Consulta consulta = consultaRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Consulta não encontrado."));

        //Atualizar campos
        consulta.setFormatoConsulta(requestDTO.getFormatoConsulta());
        consulta.setFormatoConsulta(requestDTO.getFormatoConsulta());
        consulta.setPagamentoConsulta(requestDTO.getPagamentoConsulta());
        consulta.setAreaProcura(requestDTO.getAreaProcura());

        //Atualizar relacionamentos, se necessários
        if (!consulta.getPaciente().getId().equals(requestDTO.getPacienteId())) {
            Paciente paciente = pacienteRepository.findById(requestDTO.getPacienteId())
                    .orElseThrow(() -> new IllegalArgumentException("Paciente não encontrado."));
            consulta.setPaciente(paciente);
        }

        if(!consulta.getMedico().getId().equals(requestDTO.getMedicoId())) {
            Medico medico = medicoRepository.findById(requestDTO.getMedicoId())
                    .orElseThrow(() -> new IllegalArgumentException("Méidco não encontrado."));
            consulta.setMedico(medico);
        }

        if(!consulta.getClinica().getId().equals(requestDTO.getClinicaId())) {
            Clinica clinica = clinicaRepository.findById(requestDTO.getClinicaId())
                    .orElseThrow(() -> new IllegalArgumentException("Clinica não encontrada."));
            consulta.setClinica(clinica);
        }

        //Salvar alterações
        Consulta consultaAtualizado = consultaRepository.save(consulta);

        //Retornar como ResponseDTO
        return toConsultaResponseDTO(consultaAtualizado);
    }

    //Remover uma consulta
    public void removerConsulta(Integer id) {
        Consulta consulta = consultaRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Consulta não encontrado."));
        consultaRepository.delete(consulta);
    }

    //Conversor de Consulta para ConsultaResponseDTO
    private ConsultaResponseDTO toConsultaResponseDTO(Consulta consulta) {
        ConsultaResponseDTO dto = new ConsultaResponseDTO();
        dto.setId(consulta.getId());
        dto.setDataConsulta(consulta.getDataConsulta());
        dto.setFormatoConsulta(consulta.getFormatoConsulta());
        dto.setPagamentoConsulta(consulta.getPagamentoConsulta());
        dto.setAreaProcura(consulta.getAreaProcura());
        dto.setPacienteNome(consulta.getPaciente().getNome());
        dto.setMedicoNome(consulta.getMedico().getNomeMed());
        dto.setClinicaNome(consulta.getClinica().getNomeClinica());
        return dto;
    }
}
