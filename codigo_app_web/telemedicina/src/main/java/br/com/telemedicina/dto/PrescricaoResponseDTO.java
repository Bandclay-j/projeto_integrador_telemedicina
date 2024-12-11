<<<<<<< HEAD
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
=======
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
>>>>>>> 5d8188aa83fcb2a81c67f3863704ca10020d18a0
