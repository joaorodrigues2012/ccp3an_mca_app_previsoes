package br.usjt.previsao_tempo.repository;

import br.usjt.previsao_tempo.model.Periodo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeriodosRepository extends JpaRepository<Periodo,Long> {
}
