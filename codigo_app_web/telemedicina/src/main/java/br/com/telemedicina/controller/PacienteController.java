package br.com.telemedicina.controller;

import br.com.telemedicina.dto.PacienteRequestDTO;
import br.com.telemedicina.dto.PacienteResponseDTO;
import br.com.telemedicina.model.Paciente;
import br.com.telemedicina.service.PacienteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/paciente")
public class PacienteController {
    private final PacienteService pacienteService;

    public PacienteController(PacienteService pacienteService) {
        this.pacienteService = pacienteService;
    }

    @GetMapping
    public ResponseEntity<List<PacienteResponseDTO>> listarPacientes() {
        List<PacienteResponseDTO> pacientes = pacienteService.getAllPaciente();
        return ResponseEntity.ok(pacientes);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PacienteResponseDTO> listarPacientesById(@PathVariable Integer id) {
        PacienteResponseDTO paciente = pacienteService.getPacienteById(id);
        return ResponseEntity.ok(paciente);
    }

    @PostMapping
    public ResponseEntity<PacienteResponseDTO> cadastrarPaciente(@RequestBody PacienteRequestDTO requestDTO) {
        PacienteResponseDTO criarPaciente = pacienteService.cadastrarPaciente(requestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(criarPaciente);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PacienteResponseDTO> atualizarPaciente(@PathVariable Integer id, @RequestBody PacienteRequestDTO requestDTO) {
        PacienteResponseDTO atualizarPaciente = pacienteService.atualizarPaciente(id, requestDTO);
        return ResponseEntity.ok(atualizarPaciente);
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
