package br.com.telemedicina.controller;

import br.com.telemedicina.model.Clinica;
import br.com.telemedicina.service.ClinicaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clinica")
public class ClinicaController {
    private ClinicaService clinicaService;

    public ClinicaController(ClinicaService clinicaService) {
        this.clinicaService = clinicaService;
    }

    @GetMapping
    public ResponseEntity<List<Clinica>> getAllClinica() {
        List<Clinica> clinicas = clinicaService.getAllClinica();
        if(clinicas.isEmpty()) {
            return ResponseEntity.status(404).build();
        }
        return ResponseEntity.ok(clinicas);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Clinica> getClinicaById(@PathVariable Integer id) {
        return clinicaService.getClinicaById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.status(404).build());
    }

    @PostMapping
    public ResponseEntity<String> cadastrarClinica(@RequestBody Clinica clinica) {
        clinicaService.cadastrarClinica(clinica);
        return ResponseEntity.status(201).body("Clinica cadastrada com sucesso!");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> atualizarClinica(@PathVariable Integer id, @RequestBody Clinica clinicaAtualizada) {
        return clinicaService.atualizarClinica(id, clinicaAtualizada)
                .map(clinica -> ResponseEntity.ok("Clinica atualizada com sucesso!"))
                .orElse(ResponseEntity.status(404).body("Erro: Clinica com ID " + id + " não encontrado."));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletarClinica(@PathVariable Integer id) {
        if (clinicaService.removerClinica(id)) {
            return ResponseEntity.ok("Clinica removida com sucesso!");
        } else {
            return ResponseEntity.status(404).body("Erro: Clinica com ID " + id + " não encontrado.");
        }
    }
}
