package br.com.telemedicina.controller;

import br.com.telemedicina.model.Paciente;
import br.com.telemedicina.service.PacienteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/paciente")
public class PacienteController {
    private PacienteService pacienteService;

    public PacienteController(PacienteService pacienteService) {
        this.pacienteService = pacienteService;
    }

    @GetMapping
    public ResponseEntity<List<Paciente>> listarPacientes() {
        List<Paciente> pacientes = pacienteService.getAllPaciente();
        if(pacientes.isEmpty()) {
            return ResponseEntity.status(404).build();
        }
        return ResponseEntity.ok(pacientes);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Paciente> listarPacientesById(@PathVariable Integer id) {
        return pacienteService.getPacienteById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.status(404).build());
    }

    @PostMapping
    public ResponseEntity<String> cadastrarPaciente(@RequestBody Paciente paciente) {
        pacienteService.cadastrarPaciente(paciente);
        return ResponseEntity.status(201).body("Paciente cadastrado com sucesso!");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> atualizarPaciente(@PathVariable Integer id, @RequestBody Paciente pacienteAtualizado) {
        return pacienteService.atualizarPaciente(id, pacienteAtualizado)
                .map(paciente -> ResponseEntity.ok("Paciente atualizado com sucesso."))
                .orElse(ResponseEntity.status(404).body("Erro: Paciente com ID " + id + " não encontrado."));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletarPaciente (@PathVariable Integer id) {
        if(pacienteService.removerPacente(id)) {
            return ResponseEntity.ok("Paciente removido com sucesso!");
        } else {
            return ResponseEntity.status(404).body("Erro: Paciente com ID " + id + " não encontrado.");
        }
    }
}
