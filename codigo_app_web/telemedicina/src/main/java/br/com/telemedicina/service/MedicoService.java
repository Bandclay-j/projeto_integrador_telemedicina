package br.com.telemedicina.service;

import br.com.telemedicina.model.Medico;
import br.com.telemedicina.repository.MedicoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedicoService {
    private MedicoRepository medicoRepository;

    public MedicoService(MedicoRepository medicoRepository) {
        this.medicoRepository = medicoRepository;
    }

    //Listar todos os medicos
    public List<Medico> getAllMedico() {
        return medicoRepository.findAll();
    }

    //Buscar Medico pelo ID
    public Optional<Medico> getMedicoById(Integer id) {
        return medicoRepository.findById(id);
    }

    //Cadastrar um medico novo
    public Medico cadastrarMedico(Medico medico) {
        return medicoRepository.save(medico);
    }

    //Atualizar um medico existente
    public Optional<Medico> atualizarMedico(Integer id, Medico medicoAtualizar) {
        return medicoRepository.findById(id).map(medico -> {
            medicoAtualizar.setId(id);
            return medicoRepository.save(medicoAtualizar);
        });
    }

    //Remover um medico pelo ID
    public boolean removerMedico(Integer id) {
        if(medicoRepository.existsById(id)) {
            medicoRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
