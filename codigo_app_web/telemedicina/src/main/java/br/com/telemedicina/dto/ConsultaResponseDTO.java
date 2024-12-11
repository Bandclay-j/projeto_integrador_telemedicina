package br.com.telemedicina.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConsultaResponseDTO {
    private Integer id;
    private LocalDate dataConsulta;
    private String formatoConsulta;
    private Float pagamentoConsulta;
    private String areaProcura;
    private String pacienteNome;
    private String medicoNome;
    private String clinicaNome;
}
