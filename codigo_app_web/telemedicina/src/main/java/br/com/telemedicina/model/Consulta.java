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
@Table(name = "consulta")
public class Consulta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private LocalDate dataConsulta;

    @Column(length = 10)
    private String formatoConsulta;

    @ManyToOne
    @JoinColumn(name = "ID_PACIENTE", nullable = false)
    private Paciente paciente;

    @ManyToOne
    @Column(name = "ID_MEDICO", nullable = false)
    private Medico medico;

    @ManyToOne
    @JoinColumn(name = "ID_CLINICA", nullable = false)
    private Clinica clinica;

    @Column
    private Float pagamentoConsulta;

    @Column(length = 200)
    private String areaProcura;
}
