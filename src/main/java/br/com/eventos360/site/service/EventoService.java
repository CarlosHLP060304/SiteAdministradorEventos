package br.com.eventos360.site.service;

import br.com.eventos360.site.model.Cidade;
import br.com.eventos360.site.model.Evento;
import br.com.eventos360.site.repository.CidadeRepository;
import br.com.eventos360.site.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Service
public class EventoService {

    @Autowired
    private EventoRepository repository;

    @Autowired
    private CidadeRepository cidadeRepository;

    @Transactional
    public void save(Evento evento) {
        repository.save(evento);
    }

    @Transactional
    public Evento findById(Long id){
        return repository.findById(id).orElseThrow(
                ()->{
                    throw new IllegalArgumentException();
                }
        );
    }

    @Transactional
    public void deleteById(Long id){
        repository.deleteById(id);
    }


    @Transactional
    public List findAll() {
        return repository.findAll();
    }



}