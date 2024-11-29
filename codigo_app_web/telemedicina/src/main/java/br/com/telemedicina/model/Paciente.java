package br.com.telemedicina.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "paciente")
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 100)
    private String nome;

    @Column(length = 15, unique = true)
    private String cpf;

    @Column
    private LocalDate dataNascimento;

    @Column(length = 10)
    private String genero;

    @Column
    private String telefone;

    @Column(length = 200)
    private String endereco;

    @Column(length = 100)
    private String email;

    @Column(length = 16, unique = true)
    private String rg;

    @Column
    private String senha;
}
