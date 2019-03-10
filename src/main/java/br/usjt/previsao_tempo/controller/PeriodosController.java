package br.usjt.previsao_tempo.controller;

import br.usjt.previsao_tempo.model.Periodo;
import br.usjt.previsao_tempo.repository.PeriodosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class PeriodosController {

    @Autowired
    private PeriodosRepository repository;

    @GetMapping("/tempo")
    public ModelAndView listarPeriodos() {
        ModelAndView mv = new ModelAndView("lista_tempo");

        List<Periodo> periodos = repository.findAll();
        mv.addObject("periodos", periodos);
        mv.addObject(new Periodo());
        return mv;
    }

public String Salvar(Periodo periodo){
        repository.save(periodo);
        return "redirect:/tempo";
}
}
