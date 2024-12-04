package br.com.telemedicina.controller;

import br.com.telemedicina.model.Consulta;
import br.com.telemedicina.service.ConsultaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consulta")
public class ConsultaController {
    private ConsultaService consultaService;

    public ConsultaController(ConsultaService consultaService) {
        this.consultaService = consultaService;
    }

    @GetMapping
    public ResponseEntity<List<Consulta>> listarConsultas() {
        List<Consulta> consultas = consultaService.getAllConsulta();
        if(consultas.isEmpty()){
            return ResponseEntity.status(404).build();
        }
        return ResponseEntity.ok(consultas);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Consulta> listarConsultaPeloId(@PathVariable Integer id) {
        return consultaService.getConsultaById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.status(404).build());
    }

    @PostMapping
    public ResponseEntity<String> cadastrarConsulta(@RequestBody Consulta consulta) {
        consultaService.cadastrarConsulta(consulta);
        return ResponseEntity.status(201).body("Consulta cadastrado com sucesso!");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> atualizarConsulta(@PathVariable Integer id, @RequestBody Consulta consultaAtualizada) {
        return consultaService.atualizarConsulta(id, consultaAtualizada)
                .map(consulta -> ResponseEntity.ok("Consulta atualizada com sucesso!"))
                .orElse(ResponseEntity.status(404).body("Erro: Consulta com ID: " + id + " não encontrado."));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletarConsulta(@PathVariable Integer id) {
        if (consultaService.removerConsulta(id)) {
            return ResponseEntity.ok("Consulta removida com sucesso!");
        } else {
            return ResponseEntity.status(404).body("Erro: Consulta com ID " + id + " não encontrado.");
        }
    }
}
