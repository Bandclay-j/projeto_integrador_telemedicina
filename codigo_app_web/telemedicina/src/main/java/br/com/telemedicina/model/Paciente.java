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

    @Column(length = 100, name = "nome")
    private String nome;

    @Column(length = 15, unique = true, name = "cpf")
    private String cpf;

    @Column(name = "dataNascimento")
    private LocalDate dataNascimento;

    @Column(length = 10, name = "genero")
    private String genero;

    @Column(name = "telefone")
    private String telefone;

    @Column(length = 200, name = "endereco")
    private String endereco;

    @Column(length = 100, name = "email")
    private String email;

    @Column(length = 16, unique = true, name = "rg")
    private String rg;

    @Column(name = "senha")
    private String senha;
}
