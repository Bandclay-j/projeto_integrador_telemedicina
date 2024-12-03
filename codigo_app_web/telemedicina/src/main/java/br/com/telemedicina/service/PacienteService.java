package br.com.telemedicina.service;

import br.com.telemedicina.model.Paciente;
import br.com.telemedicina.repository.PacienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PacienteService {
    private PacienteRepository pacienteRepository;

    public PacienteService(PacienteRepository pacienteRepository) {
        this.pacienteRepository = pacienteRepository;
    }

    //Listar todos os pacientes
    public List<Paciente> getAllPaciente() {
        return pacienteRepository.findAll();
    }

    //Listar o paciente pelo ID
    public Optional<Paciente> getPacienteById(Integer id) {
        return pacienteRepository.findById(id);
    }

    //Cadastrar paciente
    public Paciente cadastrarPaciente(Paciente paciente) {
        return pacienteRepository.save(paciente);
    }

    //Atualizar um paciente existente
    public Optional<Paciente> atualizarPaciente(Integer id, Paciente pacienteAtualizar) {
        return pacienteRepository.findById(id).map(paciente -> {
            pacienteAtualizar.setId(id);
            return pacienteRepository.save(pacienteAtualizar);
        });
    }

    //Remover paciente pelo Id
    public boolean removerPacente(Integer id) {
        if(pacienteRepository.existsById(id)) {
            pacienteRepository.deleteById(id);
        }
        return false;
    }
}
