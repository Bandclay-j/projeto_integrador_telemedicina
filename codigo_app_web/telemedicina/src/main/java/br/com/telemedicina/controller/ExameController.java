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
    public ResponseEntity<List<ExameResponseDTO>> listarExames() {
        List<ExameResponseDTO> exames = exameService.getAllExames();
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
    public ResponseEntity<ExameResponseDTO> atualizarExame(@PathVariable Integer id, @RequestBody ExameRequestDTO requestDTO) {
        ExameResponseDTO exameAtualizado = exameService.atualizarExame(id, requestDTO);
        return ResponseEntity.ok(exameAtualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarExame (@PathVariable Integer id) {
        exameService.deletarExame(id);
        return ResponseEntity.noContent().build();
    }
}
