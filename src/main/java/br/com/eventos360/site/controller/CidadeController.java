package br.com.eventos360.site.controller;

import br.com.eventos360.site.model.Cidade;
import br.com.eventos360.site.model.Evento;
import br.com.eventos360.site.service.CidadeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/cidade")
public class CidadeController {

    @Autowired
    private CidadeService service;

    @GetMapping("/cadastrar")
    public String carregarPaginaFormulario(){

        return "pages/nova_cidade";
    }

    @PostMapping("/cadastrar")
    public String salvarDadosEvento(@Valid Cidade cidade, Model model, BindingResult result){
        service.save(cidade);
        if(result.hasErrors()){
            return "/pages/nova_cidade";
        }
        return "redirect:/cidade/listar";
    }

    @GetMapping("/listar")
    public String carregarPaginaListagem(Model model){
        model.addAttribute("cidades",service.findAll());
        return "pages/listar_cidades";
    }

    @GetMapping("/editar/{id}")
    public String carregaPaginaEditar(@PathVariable("id") Long id, Model model){
        Cidade cidade = service.findById(id);
        model.addAttribute("cidade",cidade);
        return "pages/editar_cidade";
    }


    @PutMapping("/{id}")
    public String alterarDadosEvento(Model model,@Valid Cidade cidade){
        service.save(cidade);
        return "redirect:/cidade/listar";
    }

    @DeleteMapping("/{id}")
    public String deletarEventoPeloNome(@PathVariable("id") Long id){
        service.deleteById(id);
        return "redirect:/cidade/listar";
    }
}
