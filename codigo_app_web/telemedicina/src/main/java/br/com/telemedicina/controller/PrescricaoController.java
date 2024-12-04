package br.com.telemedicina.controller;

import br.com.telemedicina.model.Prescricao;
import br.com.telemedicina.service.PrescricaoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/prescricao")
public class PrescricaoController {

    private PrescricaoService prescricaoService;

    public PrescricaoController(PrescricaoService prescricaoService) {
        this.prescricaoService = prescricaoService;
    }

    @GetMapping
    public ResponseEntity<List<Prescricao>> listarPrescricao() {
        List<Prescricao> prescricaos = prescricaoService.getAllPrescricao();
        if(prescricaos.isEmpty()) {
            return ResponseEntity.status(404).build();
        }
        return ResponseEntity.ok(prescricaos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Prescricao> listarPrescricaoPeloId (@PathVariable Integer id) {
        return prescricaoService.getPrescricaoById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.status(404).build());
    }

    @PostMapping
    public ResponseEntity<String> cadastrarPrescricao(@RequestBody Prescricao prescricao) {
        prescricaoService.cadastrarPrescricoes(prescricao);
        return ResponseEntity.status(201).body("Prescrição cadastrada com sucesso.");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> atualizarPrescricao (@PathVariable Integer id, @RequestBody Prescricao prescricaoAtualizada) {
        return prescricaoService.atualizarPrescricao(id, prescricaoAtualizada)
                .map(prescricao -> ResponseEntity.ok("Prescrição atualizada com sucesso!"))
                .orElse(ResponseEntity.status(404).body("Erro: Prescrição com ID " + id + " não econtrada."));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletarPrescricao (@PathVariable Integer id) {
        if(prescricaoService.removerPrescricao(id)) {
            return ResponseEntity.ok("Prescrição removida com sucesso.");
        } else {
            return ResponseEntity.status(404).body("Erro: Prescrição com ID " + id + " não encontrada.");
        }
    }
}
