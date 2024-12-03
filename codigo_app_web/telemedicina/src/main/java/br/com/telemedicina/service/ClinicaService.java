package br.com.telemedicina.service;

import br.com.telemedicina.model.Clinica;
import br.com.telemedicina.repository.ClinicaRepository;

import java.util.List;
import java.util.Optional;

public class ClinicaService {
    private ClinicaRepository clinicaRepository;

    public ClinicaService(ClinicaRepository clinicaRepository) {
        this.clinicaRepository = clinicaRepository;
    }

    //Listar as clinicas
    public List<Clinica> getAllClinica() {
        return clinicaRepository.findAll();
    }

    //Listar as clinicas pelo ID
    public Optional<Clinica> getClinicaById(Integer id) {
        return clinicaRepository.findById(id);
    }

    //Cadastrar Clinica
    public Clinica cadastrarClinica(Clinica clinica) {
        return clinicaRepository.save(clinica);
    }

    //Atualizar clinica existente
    public Optional<Clinica> atualizarClinica(Integer id, Clinica clinicaAtualizar) {
        return clinicaRepository.findById(id).map(clinica -> {
            clinicaAtualizar.setId(id);
            return clinicaRepository.save(clinicaAtualizar);
        });
    }

    //Deletar clinica
    public boolean removerClinica(Integer id) {
        if(clinicaRepository.existsById(id)) {
            clinicaRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
