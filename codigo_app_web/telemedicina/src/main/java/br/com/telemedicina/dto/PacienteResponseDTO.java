package br.com.telemedicina.dto;

import br.com.telemedicina.util.DataMask;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PacienteResponseDTO {

    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private String genero;
    private String telefone;
    private String endereco;
    private String email;
    private String rg;

    public String getCpf() {
        return DataMask.maskCpf(cpf);
    }

    public String getRg() {
        return DataMask.maskRg(rg);
    }

    public String getTelefone() {
        return DataMask.maskTelefone(telefone);
    }
}
