package br.com.telemedicina.repository;

import br.com.telemedicina.model.Exame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExameRepository extends JpaRepository<Exame, Integer> {

}
