package br.com.telemedicina.service;

import br.com.telemedicina.model.Exame;
import br.com.telemedicina.repository.ExameRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class ExameService {
    private ExameRepository exameRepository;

    //Listar os exames
    public List<Exame> getAllExames() {
        return exameRepository.findAll();
    }

    //Listar os exames pelo ID
    public Optional<Exame> getExameById(@PathVariable Integer id) {
        return exameRepository.findById(id);
    }

    //Cadastrar exames
    public Exame cadastrarExame(Exame exame) {
        return exameRepository.save(exame);
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
