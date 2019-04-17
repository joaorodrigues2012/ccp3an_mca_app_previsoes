package br.usjt.previsao_tempo.service;

import br.usjt.previsao_tempo.model.Periodo;
import br.usjt.previsao_tempo.repository.PeriodosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeridosService {

    @Autowired
    private PeriodosRepository repository;

    public void salvar(Periodo periodo) {
        repository.save(periodo);
    }

    public List<Periodo> listarTodos(){
        return repository.findAll();
    }

    public List<Periodo> buscarCidade(String nome){
        return repository.findAllByCidade_Nome(nome);
    }

    public List<Periodo> buscarLateLon(Double lat, Double lon){
        return repository.findAllByCidade_LatitudeAndCidade_Longitude(lat,lon);
    }

}
