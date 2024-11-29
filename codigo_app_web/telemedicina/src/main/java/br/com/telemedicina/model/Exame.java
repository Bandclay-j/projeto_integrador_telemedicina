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
@Table(name = "exame")
public class Exame {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 300)
    private String diagnosticoExame;

    @Column
    private String statusExame;

    @Column
    private LocalDate dataExame;

    @Column(columnDefinition = "TEXT")
    private String descricaoExame;

    @Column
    private float valorExame;

    @ManyToOne
    @JoinColumn(name = "ID_PACIENTE", referencedColumnName = "ID")
    private Paciente paciente;

    @ManyToOne
    @JoinColumn(name = "ID_MEDICO", referencedColumnName = "ID")
    private Medico medico;

    @ManyToOne
    @JoinColumn(name = "ID_CLINICA", referencedColumnName = "ID")
    private Clinica clinica;
}
