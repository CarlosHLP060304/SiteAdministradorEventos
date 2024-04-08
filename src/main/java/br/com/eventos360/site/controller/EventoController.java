package br.com.eventos360.site.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/evento")
public class EventoController {
    @GetMapping("/listar")
    public String carregarPaginaListagem(){
        return "pages/listar_eventos";
    }
    @GetMapping("/cadastrar")
    public String carregarPaginaFormulario(){
        return "pages/novo_evento";
    }

}
