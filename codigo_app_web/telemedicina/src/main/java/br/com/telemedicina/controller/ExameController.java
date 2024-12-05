package br.com.telemedicina.controller;

import br.com.telemedicina.dto.ExameRequestDTO;
import br.com.telemedicina.dto.ExameResponseDTO;
import br.com.telemedicina.model.Exame;
import br.com.telemedicina.service.ExameService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exame")
public class ExameController {

    private ExameService exameService;

    public ExameController(ExameService exameService) {
        this.exameService = exameService;
    }

    @GetMapping
    public ResponseEntity<List<Exame>> listarExames() {
        List<Exame> exames = exameService.getAllExames();
        if(exames.isEmpty()){
            return ResponseEntity.status(404).build();
        }
        return ResponseEntity.ok(exames);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ExameResponseDTO> buscarExamePorId(@PathVariable Integer id) {
        ExameResponseDTO exameResponseDTO = exameService.buscarExamePorId(id);
        return ResponseEntity.ok(exameResponseDTO);
    }

    @PostMapping
    public ResponseEntity<ExameResponseDTO> cadastrarExame(@RequestBody @Valid ExameRequestDTO exameRequestDTO) {
        ExameResponseDTO exameResponseDTO = exameService.cadastrarExame(exameRequestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(exameResponseDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> atualizarExame(@PathVariable Integer id, @RequestBody Exame exameAtualizado) {
        return exameService.atualizarExame(id, exameAtualizado)
                .map(exame -> ResponseEntity.ok("Exame atualizado com sucesso!"))
                .orElse(ResponseEntity.status(404).body("Erro: Exame com ID " + id + " não encontrado."));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletarExame (@PathVariable Integer id) {
        if(exameService.removerExame(id)) {
            return ResponseEntity.ok("Exame removido com sucesso!");
        } else {
            return ResponseEntity.status(404).body("Erro: Exame com ID " + id + " não encontrado.");
        }
    }
}
