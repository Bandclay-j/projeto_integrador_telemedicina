package br.com.telemedicina.service;

import br.com.telemedicina.dto.PrescricaoRequestDTO;
import br.com.telemedicina.dto.PrescricaoResponseDTO;
import br.com.telemedicina.model.Medico;
import br.com.telemedicina.model.Paciente;
import br.com.telemedicina.model.Prescricao;
import br.com.telemedicina.repository.MedicoRepository;
import br.com.telemedicina.repository.PacienteRepository;
import br.com.telemedicina.repository.PrescricaoRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PrescricaoService {
    private final PrescricaoRepository prescricaoRepository;

    private final MedicoRepository medicoRepository;

    private final PacienteRepository pacienteRepository;

    public PrescricaoService(PrescricaoRepository prescricaoRepository, MedicoRepository medicoRepository, PacienteRepository pacienteRepository) {
        this.prescricaoRepository = prescricaoRepository;
        this.medicoRepository = medicoRepository;
        this.pacienteRepository = pacienteRepository;
    }

    //Listar as prescrições
    public List<PrescricaoResponseDTO> getAllPrescricao() {
        List<Prescricao> prescricoes = prescricaoRepository.findAll();
        return prescricoes.stream()
                .map(this::converterParaPrescricaoResponseDTO)
                .collect(Collectors.toList());
    }

    //Listar prescrições pelo ID
    public PrescricaoResponseDTO getPrescricaoById(Integer id) {
        Prescricao prescricao = prescricaoRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Prescrição não encontrado."));
        return converterParaPrescricaoResponseDTO(prescricao);
    }

    //Cadastrar prescrições
    public PrescricaoResponseDTO cadastrarPrescricoes(PrescricaoRequestDTO requestDTO) {
        if(requestDTO.getPacienteId() == null || requestDTO.getMedicoId() == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "IDs de paciente e médico é obrigatório.");
        }

        Paciente paciente = pacienteRepository.findById(requestDTO.getPacienteId())
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Paciente não encontrado."));
        Medico medico = medicoRepository.findById(requestDTO.getMedicoId())
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Médico não encontrado."));

        Prescricao prescricao = new Prescricao();
        prescricao.setMedicamento(requestDTO.getMedicamento());
        prescricao.setObservacao(requestDTO.getObservacao());
        prescricao.setPaciente(paciente);
        prescricao.setMedico(medico);
        prescricao.setDataPrescricao(requestDTO.getDataPrescricao());

        Prescricao prescricaoSalva = prescricaoRepository.save(prescricao);

        return converterParaPrescricaoResponseDTO(prescricaoSalva);
    }

    //Atualizar prescrições
    public PrescricaoResponseDTO atualizarPrescricao(Integer id, PrescricaoRequestDTO requestDTO) {
        Prescricao prescricao = prescricaoRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Prescrição não encontrado."));

        Paciente paciente = pacienteRepository.findById(requestDTO.getPacienteId())
                .orElseThrow(() -> new IllegalArgumentException("Paciente não encontrado."));

        Medico medico = medicoRepository.findById(requestDTO.getMedicoId())
                .orElseThrow(() -> new IllegalArgumentException("Médico não encontrado."));

        prescricao.setMedicamento(requestDTO.getMedicamento());
        prescricao.setObservacao(requestDTO.getObservacao());
        prescricao.setPaciente(paciente);
        prescricao.setMedico(medico);
        prescricao.setDataPrescricao(requestDTO.getDataPrescricao());

        Prescricao prescricaoAtualizada = prescricaoRepository.save(prescricao);
        return converterParaPrescricaoResponseDTO(prescricaoAtualizada);
    }

    //Deletar prescrições
    public void removerPrescricao (Integer id) {
        Prescricao prescricao = prescricaoRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Prescrição não encontrado."));
        prescricaoRepository.delete(prescricao);
    }


    private PrescricaoResponseDTO converterParaPrescricaoResponseDTO(Prescricao prescricao) {
        return new PrescricaoResponseDTO(
                prescricao.getId(),
                prescricao.getMedicamento(),
                prescricao.getObservacao(),
                prescricao.getPaciente().getId(),
                prescricao.getPaciente().getNome(),
                prescricao.getMedico().getId(),
                prescricao.getMedico().getNomeMed(),
                prescricao.getDataPrescricao()
        );
    }

}
