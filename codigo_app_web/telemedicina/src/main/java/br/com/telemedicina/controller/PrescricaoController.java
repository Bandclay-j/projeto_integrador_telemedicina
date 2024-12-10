package br.com.telemedicina.controller;

import br.com.telemedicina.dto.PrescricaoRequestDTO;
import br.com.telemedicina.dto.PrescricaoResponseDTO;
import br.com.telemedicina.model.Prescricao;
import br.com.telemedicina.service.PrescricaoService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
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
    public ResponseEntity<List<PrescricaoResponseDTO>> listarPrescricao() {
        List<PrescricaoResponseDTO> prescricoes = prescricaoService.getAllPrescricao();
        return ResponseEntity.ok(prescricoes);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PrescricaoResponseDTO> listarPrescricaoPeloId (@PathVariable Integer id) {
        PrescricaoResponseDTO prescricaoResponseDTO = prescricaoService.getPrescricaoById(id);
        return ResponseEntity.ok(prescricaoResponseDTO);
    }

    @PostMapping
    public ResponseEntity<PrescricaoResponseDTO> cadastrarPrescricao(@RequestBody @Valid PrescricaoRequestDTO prescricaoRequestDTO) {
        PrescricaoResponseDTO prescricaoResponseDTO = prescricaoService.cadastrarPrescricoes(prescricaoRequestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(prescricaoResponseDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PrescricaoResponseDTO> atualizarPrescricao (@PathVariable Integer id, @RequestBody PrescricaoRequestDTO requestDTO) {
        PrescricaoResponseDTO prescricaoAtualizada = prescricaoService.atualizarPrescricao(id, requestDTO);
        return ResponseEntity.ok(prescricaoAtualizada);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletarPrescricao (@PathVariable Integer id) {
        prescricaoService.removerPrescricao(id);
        return ResponseEntity.noContent().build();
    }
}
