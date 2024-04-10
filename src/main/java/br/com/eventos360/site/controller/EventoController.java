package br.com.eventos360.site.controller;

import br.com.eventos360.site.model.Evento;
import br.com.eventos360.site.service.EventoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/evento")
public class EventoController {

    @Autowired
    private EventoService service;

    @GetMapping("/listar")
    public String carregarPaginaListagem(){
        return "pages/listar_eventos";
    }
    @GetMapping("/cadastrar")
    public String carregarPaginaFormulario(){
        return "pages/novo_evento";
    }

    @PostMapping("/cadastrar")
    public String salvarDadosEvento(Model model){
        // Evento evento = (Evento) model.getAttribute("evento");
        // service.save(evento);
        System.out.println(model.getAttribute("url"));
        return  "redirect:/evento/listar";
    }

}
