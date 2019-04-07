package br.usjt.previsao_tempo.model;

import javax.persistence.*;

@Entity
@Table(name = "tb_semana")
public class DiaSemana {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_semana")
    private Long id;
    @Column(name = "dia_semana")
    private String dia;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }
}
