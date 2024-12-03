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

    @Column(length = 300, name = "diagnosticoExame")
    private String diagnosticoExame;

    @Column(name = "statusExame")
    private String statusExame;

    @Column(name = "dataExame")
    private LocalDate dataExame;

    @Column(columnDefinition = "TEXT", name = "descricaoExame")
    private String descricaoExame;

    @Column(name = "valorExame")
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
