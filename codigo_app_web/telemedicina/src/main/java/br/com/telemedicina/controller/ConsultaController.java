package br.com.telemedicina.controller;

import br.com.telemedicina.dto.ConsultaRequestDTO;
import br.com.telemedicina.dto.ConsultaResponseDTO;
import br.com.telemedicina.model.Consulta;
import br.com.telemedicina.service.ConsultaService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
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
    public ResponseEntity<List<ConsultaResponseDTO>> listarConsultas() {
        List<ConsultaResponseDTO> consultas = consultaService.getAllConsulta();
        return ResponseEntity.ok(consultas);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ConsultaResponseDTO> listarConsultaPeloId(@PathVariable Integer id) {
        ConsultaResponseDTO consultaResponseDTO = consultaService.getConsultaById(id);
        return ResponseEntity.ok(consultaResponseDTO);
    }

    //Buscar consulta pelo id do paciente
    @GetMapping("/paciente/{pacienteId}")
    public ResponseEntity<List<ConsultaResponseDTO>> listaConsultaByPaciente(@PathVariable Integer pacienteId) {
       List<ConsultaResponseDTO> consultasPaciente = consultaService.getConsultaByPaciente(pacienteId);
       return ResponseEntity.ok(consultasPaciente);
    }

    //Buscar consulta pelo Id do médico
    @GetMapping("/medico/{medicoId}")
    public ResponseEntity<List<ConsultaResponseDTO>> listaConsultaByMedico(@PathVariable Integer medicoId) {
        List<ConsultaResponseDTO> consultaMedico = consultaService.getConsultaByMedico(medicoId);
        return ResponseEntity.ok(consultaMedico);
    }

    @PostMapping
    public ResponseEntity<ConsultaResponseDTO> cadastrarConsulta(@RequestBody @Valid ConsultaRequestDTO consultaRequestDTO) {
        ConsultaResponseDTO consultaResponseDTO = consultaService.cadastrarConsulta(consultaRequestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(consultaResponseDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ConsultaResponseDTO> atualizarConsulta(@PathVariable Integer id, @RequestBody ConsultaRequestDTO requestDTO) {
        ConsultaResponseDTO consultaAtualizada = consultaService.atualizarConsulta(id, requestDTO);
        return ResponseEntity.ok(consultaAtualizada);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarConsulta(@PathVariable Integer id) {
        consultaService.removerConsulta(id);
        return ResponseEntity.noContent().build();
    }
}
