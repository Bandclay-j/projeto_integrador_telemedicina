package br.com.telemedicina.service;

import br.com.telemedicina.dto.PacienteRequestDTO;
import br.com.telemedicina.dto.PacienteResponseDTO;
import br.com.telemedicina.model.Paciente;
import br.com.telemedicina.repository.PacienteRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PacienteService {
    private final PacienteRepository pacienteRepository;
    private PasswordEncoder passwordEncoder;

    public PacienteService(PacienteRepository pacienteRepository, PasswordEncoder passwordEncoder) {
        this.pacienteRepository = pacienteRepository;
        this.passwordEncoder = passwordEncoder;
    }

    //Listar todos os pacientes
    public List<PacienteResponseDTO> getAllPaciente() {
        List<Paciente> pacientes = pacienteRepository.findAll();
        return pacientes.stream()
                .map(this::convertDTO)
                .collect(Collectors.toList());
    }

    //Listar o paciente pelo ID
    public PacienteResponseDTO getPacienteById(Integer id) {
        Paciente paciente = pacienteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Paciente não encontrado com o ID: " + id));
        return convertDTO(paciente);
    }

    //Cadastrar paciente
    public PacienteResponseDTO cadastrarPaciente(PacienteRequestDTO requestDTO) {
        Paciente paciente = new Paciente();
        paciente.setNome(requestDTO.getNome());
        paciente.setCpf(requestDTO.getCpf());
        paciente.setDataNascimento(requestDTO.getDataNascimento());
        paciente.setTelefone(requestDTO.getTelefone());
        paciente.setEndereco(requestDTO.getEndereco());
        paciente.setEmail(requestDTO.getEmail());

        String senhaCriptografada = passwordEncoder.encode(requestDTO.getSenha());
        paciente.setSenha(senhaCriptografada);

        Paciente pacienteSalvar = pacienteRepository.save(paciente);

        return convertDTO(pacienteSalvar);
    }

    //Atualizar um paciente existente
    public PacienteResponseDTO atualizarPaciente(Integer id, PacienteRequestDTO requestDTO) {

        Paciente pacienteExistente = pacienteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Paciente não encontrado com ID: " + id));

        pacienteExistente.setNome(requestDTO.getNome());
        pacienteExistente.setCpf(requestDTO.getCpf());
        pacienteExistente.setDataNascimento(requestDTO.getDataNascimento());
        pacienteExistente.setTelefone(requestDTO.getTelefone());
        pacienteExistente.setEndereco(requestDTO.getEndereco());
        pacienteExistente.setEmail(requestDTO.getEmail());
        pacienteExistente.setRg(requestDTO.getRg());
        pacienteExistente.setSenha(requestDTO.getSenha());

        Paciente pacienteAtualizado = pacienteRepository.save(pacienteExistente);
        return convertDTO(pacienteAtualizado);
    }

    //Remover paciente pelo Id
    public boolean removerPacente(Integer id) {
        if(pacienteRepository.existsById(id)) {
            pacienteRepository.deleteById(id);
            return true;
        }
        return false;
    }

    private PacienteResponseDTO convertDTO(Paciente paciente) {
        return new PacienteResponseDTO(
                paciente.getNome(),
                paciente.getCpf(),
                paciente.getDataNascimento(),
                paciente.getGenero(),
                paciente.getTelefone(),
                paciente.getEndereco(),
                paciente.getEmail(),
                paciente.getRg()
        );
    }
}
