package br.usjt.previsao_tempo.repository;

import br.usjt.previsao_tempo.model.Periodo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PeriodosRepository extends JpaRepository<Periodo,Long> {

     List<Periodo> findAllByCidade_Nome(String nome);

     List<Periodo> findAllByCidade_LatitudeAndCidade_Longitude(Double lat, Double lon);

}
