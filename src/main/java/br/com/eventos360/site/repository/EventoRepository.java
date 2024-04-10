package br.com.eventos360.site.repository;


import br.com.eventos360.site.model.Evento;
import org.springframework.data.jpa.repository.JpaRepository;



public interface EventoRepository extends JpaRepository<Evento,Long> {
}
