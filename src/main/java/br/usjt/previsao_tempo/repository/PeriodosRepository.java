package br.usjt.previsao_tempo.repository;

import br.usjt.previsao_tempo.model.Cidade;
import br.usjt.previsao_tempo.model.Periodo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.scheduling.annotation.Async;

import java.util.List;
import java.util.concurrent.Future;

public interface PeriodosRepository extends JpaRepository<Periodo,Long> {

    //List<Periodo> findAllByCidade_Nome(String nome);

     //List<Periodo> findAllByCidade_LatitudeAndCidade_Longitude(Double lat, Double lon);

     //List<Periodo> findAllByCidade_NomeIgnoreCase(String nome);
/*-----------------------------------------ASSINCRONA--------------------------------------------------------------*/
     @Async
     public Future< List<Periodo>> findAllByCidade_LatitudeAndCidade_Longitude (Double lat, Double lon);

     @Async
     public Future< List<Periodo>> findAllByCidade_Nome(String nome);

     @Async
     public Future< List<Periodo>> findAllByCidade_NomeIgnoreCase (String nome);

/*------------------------------------------------QUERY-----------------------------------------------------------------*/


     @Query("select c.nome from Periodo p inner join p.cidade c where c.id = p.id")
     public List<Periodo> buscaPeloNome(String nome);



}
