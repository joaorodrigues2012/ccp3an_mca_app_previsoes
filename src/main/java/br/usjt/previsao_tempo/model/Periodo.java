package br.usjt.previsao_tempo.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tb_periodo")
public class Periodo implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_periodo")
    private Long id;
    //    @Column(name = "dia_periodo")
//    private String diaDaSemana;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(nullable = false, name = "id_semana", foreignKey = @ForeignKey(name = "FK_tb_periodo_tb_semana"))
    private DiaSemana diaSemana;
    @Column(name = "tempmin_periodo")
    private Double temperaturaMin;
    @Column(name = "tempmax_periodo")
    private Double temperaturaMax;
    @Column(name = "humidade_periodo")
    private Double humidade;
    @Column(name = "datahora_periodo")
    private String dataHora;
    @Column(name = "desc_periodo")
    private String discricao;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(nullable = false,name = "id_cidade",foreignKey = @ForeignKey(name = "FK_tb_periodo_tb_cidade"))
    private Cidade cidade;


    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public DiaSemana getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(DiaSemana diaSemana) {
        this.diaSemana = diaSemana;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

//    public String getDiaDaSemana() {
//        return diaDaSemana;
//    }
//
//    public void setDiaDaSemana(String diaDaSemana) {
//        this.diaDaSemana = diaDaSemana;
//    }

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

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }


    @Override
    public String toString() {
        return diaSemana.getDia() + " "
                + "Temperatura minima: " + getTemperaturaMin() + "ºC "
                + "Temperatura maxima: " + getTemperaturaMax() + "ºC "
                + "Humidade: " + getHumidade() + "%";
    }
}
