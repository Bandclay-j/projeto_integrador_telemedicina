package br.com.telemedicina.repository;

import br.com.telemedicina.model.Consulta;
import br.com.telemedicina.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConsultaRepository extends JpaRepository<Consulta, Integer> {
    //Listagem das consultas pelo Id do Paciente
    List<Consulta> findByPacienteId(Integer pacienteId);
}
