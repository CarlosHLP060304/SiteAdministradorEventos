package br.com.eventos360.site.controller;

import br.com.eventos360.site.model.Evento;
import br.com.eventos360.site.service.EventoService;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/evento")
public class EventoController {

    @Autowired
    private EventoService service;

    @GetMapping("/listar")
    public String carregarPaginaListagem(Model model){
        model.addAttribute("eventos",service.findAll());
        return "pages/listar_eventos";
    }
    @GetMapping("/cadastrar")
    public String carregarPaginaFormulario(){
        return "pages/novo_evento";
    }

    @GetMapping("/editar/{id}")
    public String carregaPaginaEditar(@PathVariable("id") Long id, Model model){
        Evento evento = service.findById(id);
        System.out.println(evento.getUrl());
        model.addAttribute("evento",evento);
        return "pages/editar_evento";
    }

    @PostMapping("/cadastrar")
    public String salvarDadosEvento(@Valid Evento evento, Model model, BindingResult result){
        service.save(evento);
        if(result.hasErrors()){
            return "/pages/novo_evento";
        }
        return "redirect:/evento/listar";
    }

    @PutMapping("/{id}")
    public String alterarDadosEvento(Model model,@Valid Evento evento){
        service.save(evento);
        return "redirect:/evento/listar";
    }



    @DeleteMapping("/{id}")
    public String deletarEventoPeloNome(@PathVariable("id") Long id){
        service.deleteById(id);
        return "redirect:/evento/listar";
    }

}
