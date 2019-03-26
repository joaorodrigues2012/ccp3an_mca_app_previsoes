package br.usjt.previsao_tempo.controller;

import br.usjt.previsao_tempo.model.Periodo;
import br.usjt.previsao_tempo.repository.PeriodosRepository;
import br.usjt.previsao_tempo.service.PeridosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class PeriodosController {

//    @Autowired
//    private PeriodosRepository repository;

//    @Autowired
//    public PeriodosController(PeriodosRepository repository) {
//        this.repository = repository;
//    }
//
//    @Autowired
//    public void setRepository(PeriodosRepository repository){
//        this.repository = repository;
//    }

    @Autowired
    private PeridosService peridosService;

    @GetMapping("/tempo")
    public ModelAndView listarPeriodos() {
        ModelAndView mv = new ModelAndView("lista_tempo");
        mv.addObject(new Periodo());
        //List<Periodo> periodos = repository.findAll();
        List<Periodo> periodos = peridosService.listarTodos();
        mv.addObject("periodos", periodos);
       return mv;
    }

    public String Salvar(Periodo periodo) {
        peridosService.salvar(periodo);
        return "redirect:/tempo";
    }
}
