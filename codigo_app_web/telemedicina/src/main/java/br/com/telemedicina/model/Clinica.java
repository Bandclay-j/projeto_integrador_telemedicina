package br.com.telemedicina.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "clinica")
public class Clinica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 100, name = "nomeClinica")
    private String nomeClinica;

    @Column(length = 200, name = "enderecoClinica")
    private String enderecoClinica;

    @Column(length = 18, unique = true, name = "cnpjClinica")
    private String cnpjClinica;

    @Column(length = 15, name = "telefoneClinica")
    private String telefoneClinica;

    @Column(length = 100, name = "emailClinica")
    private String emailClinica;

    @Column(name = "latitude")
    private String latitudeClinica;

    @Column(name = "longitude")
    private String longitudeClinica;
}
