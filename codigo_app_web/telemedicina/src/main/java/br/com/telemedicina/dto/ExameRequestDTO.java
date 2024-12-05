package br.com.telemedicina.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExameRequestDTO {
    @NotNull(message = "O ID do paciente é obrigatorio.")
    @JsonProperty("pacienteId")
    private Integer pacienteId;

    @NotNull(message = "O ID do médico é obrigatorio.")
    @JsonProperty("medicoId")
    private Integer medicoId;

    @NotNull(message = "O ID da clinica é obrigatório.")
    @JsonProperty("clinicaId")
    private Integer clinicaId;

    private String diagnosticoExame;
    private String statusExame;
    private LocalDate dataExame;
    private String descricaoExame;
    private float valorExame;
}
