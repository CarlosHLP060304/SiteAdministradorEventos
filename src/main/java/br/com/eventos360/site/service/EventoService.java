package br.com.eventos360.site.service;

import br.com.eventos360.site.model.Evento;
import br.com.eventos360.site.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EventoService {

    @Autowired
    private EventoRepository repository;

    @Transactional
    public void save(Evento evento) {
        repository.save(evento);
    }

    @Transactional
    public List findAll() {
        return repository.findAll();
    }

}