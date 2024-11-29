package br.com.telemedicina.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "medico")
public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 100)
    private String nomeMed;

    @Column(length = 15)
    private String cpfMed;

    @Column
    private LocalDate nascimentoMed;

    @Column(length = 10)
    private String generoMed;

    @Column(length = 15)
    private String telefoneMed;

    @Column(length = 200)
    private String enderecoMed;

    @Column(length = 100)
    private String emailMed;

    @Column(length = 16)
    private String rgMed;

    @Column(length = 12)
    private String registroMed;

    @Column(length = 100)
    private String especializacao;

    @Column(length = 100)
    private String instituicaoEnsino;

    @Column
    private Date conclusaoGrad;

    @Column(length = 100)
    private String certificacao;

    @Column(length = 100)
    private String areaInteresse;

    @Column(length = 100)
    private String credenciais;

    @Column(columnDefinition = "TEXT")
    private String experiencia;

    @Column
    private String senhaMed;
}
