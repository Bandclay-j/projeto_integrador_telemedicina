package br.com.telemedicina.service;

import br.com.telemedicina.dto.ExameRequestDTO;
import br.com.telemedicina.dto.ExameResponseDTO;
import br.com.telemedicina.model.Clinica;
import br.com.telemedicina.model.Exame;
import br.com.telemedicina.model.Medico;
import br.com.telemedicina.model.Paciente;
import br.com.telemedicina.repository.ClinicaRepository;
import br.com.telemedicina.repository.ExameRepository;
import br.com.telemedicina.repository.MedicoRepository;
import br.com.telemedicina.repository.PacienteRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ExameService {
    private final ExameRepository exameRepository;
    private final MedicoRepository medicoRepository;
    private final PacienteRepository pacienteRepository;
    private final ClinicaRepository clinicaRepository;

    public ExameService(ExameRepository exameRepository, MedicoRepository medicoRepository, PacienteRepository pacienteRepository, ClinicaRepository clinicaRepository) {
        this.exameRepository = exameRepository;
        this.medicoRepository = medicoRepository;
        this.pacienteRepository = pacienteRepository;
        this.clinicaRepository = clinicaRepository;
    }

    //Listar os exames
    public List<ExameResponseDTO> getAllExames() {
        List<Exame> exames = exameRepository.findAll();
        return exames.stream()
                .map(this::toExameResponseDTO)
                .collect(Collectors.toList());
    }

    //Listar os exames pelo ID
    public ExameResponseDTO buscarExamePorId(Integer id) {
        Exame exame = exameRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Exame não encontrado"));
        return toExameResponseDTO(exame);
    }

    //Cadastrar exames
    public ExameResponseDTO cadastrarExame(ExameRequestDTO dto) {
        if (dto.getPacienteId() == null || dto.getMedicoId() == null || dto.getClinicaId() == null) {
            throw new IllegalArgumentException("IDs de paciente, médico e clínica são obrigatórios.");
        }

        Paciente paciente = pacienteRepository.findById(dto.getPacienteId())
                .orElseThrow(() -> new IllegalArgumentException("Paciente não encontrado"));
        Medico medico = medicoRepository.findById(dto.getMedicoId())
                .orElseThrow(() -> new IllegalArgumentException("Médico não encontrado"));
        Clinica clinica = clinicaRepository.findById(dto.getClinicaId())
                .orElseThrow(() -> new IllegalArgumentException("Clínica não encontrada"));

        Exame exame = new Exame();
        exame.setDiagnosticoExame(dto.getDiagnosticoExame());
        exame.setStatusExame(dto.getStatusExame());
        exame.setDataExame(dto.getDataExame());
        exame.setDescricaoExame(dto.getDescricaoExame());
        exame.setValorExame(dto.getValorExame());
        exame.setPaciente(paciente);
        exame.setMedico(medico);
        exame.setClinica(clinica);

        exame = exameRepository.save(exame);

        return new ExameResponseDTO(
                exame.getId(),
                exame.getDiagnosticoExame(),
                exame.getStatusExame(),
                exame.getDataExame(),
                exame.getDescricaoExame(),
                exame.getValorExame(),
                paciente.getNome(),
                medico.getNomeMed(),
                clinica.getNomeClinica()
        );
    }

    //Atualizar exames
    public ExameResponseDTO atualizarExame(Integer id, ExameRequestDTO requestDTO) {
        Exame exame = exameRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Exame não encontrado."));

        // Atualizar campos
        exame.setDiagnosticoExame(requestDTO.getDiagnosticoExame());
        exame.setStatusExame(requestDTO.getStatusExame());
        exame.setDataExame(requestDTO.getDataExame());
        exame.setDescricaoExame(requestDTO.getDescricaoExame());
        exame.setValorExame(requestDTO.getValorExame());

        // Atualizar relacionamentos, se necessário
        if (!exame.getPaciente().getId().equals(requestDTO.getPacienteId())) {
            Paciente paciente = pacienteRepository.findById(requestDTO.getPacienteId())
                    .orElseThrow(() -> new IllegalArgumentException("Paciente não encontrado."));
            exame.setPaciente(paciente);
        }
        if (!exame.getMedico().getId().equals(requestDTO.getMedicoId())) {
            Medico medico = medicoRepository.findById(requestDTO.getMedicoId())
                    .orElseThrow(() -> new IllegalArgumentException("Médico não encontrado."));
            exame.setMedico(medico);
        }
        if (!exame.getClinica().getId().equals(requestDTO.getClinicaId())) {
            Clinica clinica = clinicaRepository.findById(requestDTO.getClinicaId())
                    .orElseThrow(() -> new IllegalArgumentException("Clínica não encontrada."));
            exame.setClinica(clinica);
        }

        // Salvar alterações
        Exame exameAtualizado = exameRepository.save(exame);

        // Retornar como ResponseDTO
        return toExameResponseDTO(exameAtualizado);
    }

    //Deletar exames
    public void deletarExame(Integer id) {
        Exame exame = exameRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Exame não encontrado."));
        exameRepository.delete(exame);
    }

    private ExameResponseDTO toExameResponseDTO(Exame exame) {
        ExameResponseDTO dto = new ExameResponseDTO();
        dto.setId(exame.getId());
        dto.setDiagnosticoExame(exame.getDiagnosticoExame());
        dto.setStatusExame(exame.getStatusExame());
        dto.setDataExame(exame.getDataExame());
        dto.setDescricaoExame(exame.getDescricaoExame());
        dto.setValorExame(exame.getValorExame());
        dto.setPacienteNome(exame.getPaciente().getNome());
        dto.setMedicoNome(exame.getMedico().getNomeMed());
        dto.setClinicaNome(exame.getClinica().getNomeClinica());
        return dto;
    }
}
