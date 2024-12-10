package br.com.telemedicina.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExameResponseDTO {
    private Integer id;
    private String diagnosticoExame;
    private String statusExame;
    private LocalDate dataExame;
    private String descricaoExame;
    private float valorExame;
    private String pacienteNome;
    private String medicoNome;
    private String clinicaNome;
}
