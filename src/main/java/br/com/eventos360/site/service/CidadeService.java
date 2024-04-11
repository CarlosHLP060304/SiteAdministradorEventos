package br.com.eventos360.site.service;

import br.com.eventos360.site.model.Cidade;
import br.com.eventos360.site.model.Evento;
import br.com.eventos360.site.repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CidadeService {

    @Autowired
    private CidadeRepository repository;

    @Transactional
    public void save(Cidade cidade) {
        repository.save(cidade);
    }

    @Transactional
    public List findAll(){
        return repository.findAll();
    }
}
