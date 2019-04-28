package br.usjt.previsao_tempo.repository;

import br.usjt.previsao_tempo.model.Cidade;
import br.usjt.previsao_tempo.model.Periodo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Async;

import java.util.List;
import java.util.concurrent.Future;

public interface PeriodosRepository extends JpaRepository<Periodo, Long> {

    //List<Periodo> findAllByCidade_Nome(String nome);

    //List<Periodo> findAllByCidade_LatitudeAndCidade_Longitude(Double lat, Double lon);

   // List<Periodo> findAllByCidade_NomeIgnoreCase(String nome);
    /*-----------------------------------------ASSINCRONA--------------------------------------------------------------*/
//     @Async
//     public Future< List<Periodo>> findAllByCidade_LatitudeAndCidade_Longitude (Double lat, Double lon);
//
//     @Async
//     public Future< List<Periodo>> findAllByCidade_Nome(String nome);
//
//     @Async
//     public Future<List<Periodo>> findAllByCidade_NomeIgnoreCase (String nome);

    /*------------------------------------------------QUERY-----------------------------------------------------------------*/


    @Query("select p from Periodo p inner join p.cidade c where c.id = p.id and upper(c.nome) = upper(:nome)")
    List<Periodo> findAllByCidade_Nome(@Param("nome") String nome);

    @Query("select p from Periodo p inner join p.cidade c where c.id = p.id and c.latitude = :latitude and c.longitude = :longitude")
    List<Periodo> findAllByCidade_LatitudeAndCidade_Longitude(@Param("latitude") Double latitude, @Param("longitude") Double longitude);

    /*--------------------------------------NAMED QUERIES-----------------------------------------------------------------------*/

    List<Periodo> BuscaPeloCidadeNome (@Param("nome") String nome);

    List<Periodo> BuscaPeloLatELon(@Param("latitude") Double latitude,@Param("longitude") Double longitude);

}
