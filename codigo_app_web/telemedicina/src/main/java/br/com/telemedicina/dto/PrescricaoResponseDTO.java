package br.com.telemedicina.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PrescricaoResponseDTO {
    private Integer id;
    private String medicamento;
    private String observacao;
    private Integer pacienteId;
    private String pacienteNome;
    private Integer medicoId;
    private String medicoNome;
    private LocalDate dataPrescricao;
}
