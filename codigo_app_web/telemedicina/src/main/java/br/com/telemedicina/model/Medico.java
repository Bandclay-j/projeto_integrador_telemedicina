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

    @Column(length = 100, name = "nomeMed")
    private String nomeMed;

    @Column(length = 15, name = "cpfMed")
    private String cpfMed;

    @Column(name = "nascimentoMed")
    private LocalDate nascimentoMed;

    @Column(length = 10, name = "generoMed")
    private String generoMed;

    @Column(length = 15, name = "telefoneMed")
    private String telefoneMed;

    @Column(length = 200,name = "enderecoMed")
    private String enderecoMed;

    @Column(length = 100, name = "emailMed")
    private String emailMed;

    @Column(length = 16, name = "rgMed")
    private String rgMed;

    @Column(length = 12, name = "registroMed")
    private String registroMed;

    @Column(length = 100, name = "especializacao")
    private String especializacao;

    @Column(length = 100, name = "instituicaoEnsino")
    private String instituicaoEnsino;

    @Column(name = "conclusaoGrad")
    private Date conclusaoGrad;

    @Column(length = 100, name = "certificacao")
    private String certificacao;

    @Column(length = 100, name = "areaInteresse")
    private String areaInteresse;

    @Column(length = 100, name = "credenciais")
    private String credenciais;

    @Column(columnDefinition = "TEXT", name = "experiencias")
    private String experiencia;

    @Column(name = "senhaMed")
    private String senhaMed;
}
