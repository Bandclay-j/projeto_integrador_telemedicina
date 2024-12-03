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

    @Column(length = 100)
    private String nomeClinica;

    @Column(length = 200)
    private String enderecoClinica;

    @Column(length = 18, unique = true)
    private String cnpjClinica;

    @Column(length = 15)
    private String telefoneClinica;

    @Column(length = 100)
    private String emailClinica;

    @Column(name = "latitude")
    private String latitudeClinica;

    @Column(name = "longitude")
    private String longitudeClinica;
}
