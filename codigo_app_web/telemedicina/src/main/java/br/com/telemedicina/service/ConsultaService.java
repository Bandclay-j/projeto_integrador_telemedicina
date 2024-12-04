package br.com.telemedicina.service;

import br.com.telemedicina.model.Consulta;
import br.com.telemedicina.repository.ConsultaRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class ConsultaService {

    private ConsultaRepository consultaRepository;

    public ConsultaService(ConsultaRepository consultaRepository) {
        this.consultaRepository = consultaRepository;
    }

    //Listar as consultas
    public List<Consulta> getAllConsulta() {
        return consultaRepository.findAll();
    }

    //Buscar consulta pelo ID
    public Optional<Consulta> getConsultaById(@PathVariable Integer id) {
        return consultaRepository.findById(id);
    }

    //Cadastrar uma consulta
    public Consulta cadastrarConsulta(Consulta consulta) {
        return consultaRepository.save(consulta);
    }

    //Atualizar uma consulta
    public Optional<Consulta> atualizarConsulta(Integer id, Consulta consultaAtualizar) {
        return consultaRepository.findById(id).map(consulta -> {
           consultaAtualizar.setId(id);
           return consultaRepository.save(consultaAtualizar);
        });
    }

    //Remover uma consulta
    public boolean removerConsulta(Integer id) {
        if(consultaRepository.existsById(id)) {
            consultaRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
