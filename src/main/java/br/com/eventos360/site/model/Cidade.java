package br.com.eventos360.site.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="tb_cidades")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(exclude = {"nome","estado","eventos"})
public class Cidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    @NotBlank(message = "Campo requerido")
    @Size(min = 3, message = "O nome da cidade deve ter no mínimo 3 caracteres")
    private String nome;
    @NotBlank(message = "Campo requerido")
    @Size(min = 3, message = "O estado deve ter no mínimo 3 caracteres")
    private String estado;
    @OneToMany(mappedBy = "cidade")
    private List<Evento> eventos = new ArrayList<>();

}
