package br.com.telemedicina.controller;

import br.com.telemedicina.model.Medico;
import br.com.telemedicina.service.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medico")
public class MedicoController {

    @Autowired
    private MedicoService medicoService;

    public MedicoController(MedicoService medicoService) {
        this.medicoService = medicoService;
    }

    @GetMapping
    public ResponseEntity<List<Medico>> listarMedicos() {
        List<Medico> medicos = medicoService.getAllMedico();
        if(medicos.isEmpty()) {
            return ResponseEntity.status(404).build();
        }
        return ResponseEntity.ok(medicos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Medico> listarMedicoPeloId(@PathVariable Integer id) {
        return medicoService.getMedicoById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.status(404).build());
    }

    @PostMapping("/cadastrar")
    public ResponseEntity<String> cadastrarMedico(@RequestBody Medico medico) {
        medicoService.cadastrarMedico(medico);
        return ResponseEntity.status(201).body("Medico cadastrado com sucesso!");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> atualizarMedico(@PathVariable Integer id, @RequestBody Medico medicoAtualizado) {
        return medicoService.atualizarMedico(id, medicoAtualizado)
                .map(medico -> ResponseEntity.ok("Medico atualizado com sucesso!"))
                .orElse(ResponseEntity.status(404).body("Erro: Médico com ID " + id + " não encontrado."));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletarMedico (@PathVariable Integer id) {
        if(medicoService.removerMedico(id)) {
            return ResponseEntity.ok("Medico removido com sucesso!");
        } else {
            return ResponseEntity.status(404).body("Erro: Médico com ID " + id + "Não encontrado.");
        }
    }
}
