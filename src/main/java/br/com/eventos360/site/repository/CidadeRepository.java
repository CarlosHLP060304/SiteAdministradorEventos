package br.com.eventos360.site.repository;

import br.com.eventos360.site.model.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeRepository extends JpaRepository<Cidade,Long> {
}
