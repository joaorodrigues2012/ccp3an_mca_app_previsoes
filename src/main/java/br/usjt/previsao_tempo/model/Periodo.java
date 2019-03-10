package br.usjt.previsao_tempo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Periodo implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue
    private Long id;
    private String diaDaSemana;
    private Double temperaturaMin;
    private Double temperaturaMax;
    private Double humidade;
    private String discricao;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDiaDaSemana() {
        return diaDaSemana;
    }

    public void setDiaDaSemana(String diaDaSemana) {
        this.diaDaSemana = diaDaSemana;
    }

    public Double getTemperaturaMin() {
        return temperaturaMin;
    }

    public void setTemperaturaMin(Double temperaturaMin) {
        this.temperaturaMin = temperaturaMin;
    }

    public Double getTemperaturaMax() {
        return temperaturaMax;
    }

    public void setTemperaturaMax(Double temperaturaMax) {
        this.temperaturaMax = temperaturaMax;
    }

    public Double getHumidade() {
        return humidade;
    }

    public void setHumidade(Double humidade) {
        this.humidade = humidade;
    }

    public String getDiscricao() {
        return toString();
    }

    public void setDiscricao(String discricao) {
        this.discricao = discricao;
    }

    @Override
    public String toString() {
        return getDiaDaSemana() + " "
                + "Temperatura minima: "+getTemperaturaMin() + "ºC "
                + "Temperatura maxima: "+getTemperaturaMax() + "ºC "
                + "Humidade: "+getHumidade()+"%";
    }
}
