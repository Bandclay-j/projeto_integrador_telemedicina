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
public class PrescricaoRequestDTO {
    private String medicamento;

    private String observacao;

    @NotNull(message = "O ID do paciente é obrigatório.")
    @JsonProperty("pacienteId")
    private Integer pacienteId;

    @NotNull(message = "O ID do médico é obrigatório.")
    @JsonProperty("medicoId")
    private Integer medicoId;

    private LocalDate dataPrescricao;
}