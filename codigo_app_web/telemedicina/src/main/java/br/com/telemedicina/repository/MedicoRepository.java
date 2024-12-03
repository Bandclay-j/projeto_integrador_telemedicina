package br.com.telemedicina.repository;

import br.com.telemedicina.model.Medico;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MedicoRepository extends JpaRepository<Medico, Integer> {

}
