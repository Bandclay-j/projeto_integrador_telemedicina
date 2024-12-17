package br.com.telemedicina.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PacienteRequestDTO {

    @NotBlank
    private String nome;

    @NotBlank
    private String cpf;

    @NotBlank
    private LocalDate dataNascimento;

    @NotBlank
    private String telefone;

    @NotBlank
    private String endereco;

    @Email
    @NotBlank
    private String email;

    @NotBlank
    private String rg;

    @NotBlank
    private String senha;
}
