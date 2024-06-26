package br.com.eventos360.site.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;


@Entity
@Table(name = "tb_eventos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(exclude = {"nome","data","url","cidade"})
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Campo requerido")
    @Size(min = 3, message = "O nome do evento deve ter no mínimo 3 caracteres")
    private String nome;

    @NotBlank(message = "Campo requerido")
    @Size(min = 10, message = "A data deve ter no mínimo 10 caracteres (dd/MM/yyyy)")
    private String data;

    @NotBlank(message = "Campo requerido")
    @Size(min = 3,message = "A url deve ter no mínimo 3 caracteres")
    private String url;

    @ManyToOne
    @JoinColumn(name = "cidade_id",nullable = false)
    private Cidade cidade;
}
