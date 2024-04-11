package br.com.eventos360.site.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;


@Entity
@Table(name = "tb_evento")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(exclude = {"nome","data","url"})
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(min = 3, message = "A data deve ter no mínimo 3 caracteres")
    private String nome;

    @NotBlank
    @Size(min = 10, message = "A data deve ter no mínimo 10 caracteres")
    private String data;

    @NotBlank
    @Size(min = 3)
    private String url;

}
