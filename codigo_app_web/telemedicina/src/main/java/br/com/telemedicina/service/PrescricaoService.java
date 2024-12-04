package br.com.telemedicina.service;

import br.com.telemedicina.model.Prescricao;
import br.com.telemedicina.repository.PrescricaoRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class PrescricaoService {
    private PrescricaoRepository prescricaoRepository;

    public PrescricaoService(PrescricaoRepository prescricaoRepository) {
        this.prescricaoRepository = prescricaoRepository;
    }

    //Listar as prescrições
    public List<Prescricao> getAllPrescricao() {
        return prescricaoRepository.findAll();
    }

    //Listar prescrições pelo ID
    public Optional<Prescricao> getPrescricaoById(@PathVariable Integer id) {
        return prescricaoRepository.findById(id);
    }

    //Cadastrar prescrições
    public Prescricao cadastrarPrescricoes(Prescricao prescricao) {
        return prescricaoRepository.save(prescricao);
    }

    //Atualizar prescrições
    public Optional<Prescricao> atualizarPrescricao(Integer id, Prescricao prescricaoAtualizar) {
        return prescricaoRepository.findById(id)
                .map(prescricao -> {
                    prescricaoAtualizar.setId(id);
                    return prescricaoRepository.save(prescricaoAtualizar);
                });
    }

    //Deletar prescrições
    public boolean removerPrescricao (Integer id) {
        if (prescricaoRepository.existsById(id)) {
            prescricaoRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
