package br.com.telemedicina.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "prescricao")
public class Prescricao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String medicamento;

    @Column
    private String observacao;

    @ManyToOne
    @JoinColumn()
    private Paciente paciente;

    @ManyToOne
    @JoinColumn()
    private Medico medico;

    @Column
    private LocalDate dataPrescricao;
}
