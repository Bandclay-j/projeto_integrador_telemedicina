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
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class ExameService {
    private ExameRepository exameRepository;
    private MedicoRepository medicoRepository;
    private PacienteRepository pacienteRepository;
    private ClinicaRepository clinicaRepository;

    public ExameService(ExameRepository exameRepository, MedicoRepository medicoRepository, PacienteRepository pacienteRepository, ClinicaRepository clinicaRepository) {
        this.exameRepository = exameRepository;
        this.medicoRepository = medicoRepository;
        this.pacienteRepository = pacienteRepository;
        this.clinicaRepository = clinicaRepository;
    }

    //Listar os exames
    public List<Exame> getAllExames() {
        return exameRepository.findAll();
    }

    //Listar os exames pelo ID
    public Optional<Exame> getExameById(@PathVariable Integer id) {
        return exameRepository.findById(id);
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

    public ExameResponseDTO buscarExamePorId(Integer id) {
        Exame exame = exameRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Exame não encontrado"));
        return toExameResponseDTO(exame);
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

    //Atualizar exames
    public Optional<Exame> atualizarExame(Integer id, Exame exameAtualizar) {
        return exameRepository.findById(id).map(exame -> {
            exameAtualizar.setId(id);
            return exameRepository.save(exameAtualizar);
        });
    }

    //Deletar exames
    public boolean removerExame(Integer id) {
        if(exameRepository.existsById(id)) {
            exameRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
