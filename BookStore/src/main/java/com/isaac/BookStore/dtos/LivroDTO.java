package com.isaac.BookStore.dtos;

import com.isaac.BookStore.domain.Livro;
import java.io.Serializable;
import javax.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;


@Getter
@Setter
public class LivroDTO implements Serializable {
    
    private static final long seriaVersionUID = 1L;
    
    private Integer id;
    
    @NotEmpty(message= "Campo TITULO é requerido")
    @Length(min = 3, max = 50, message= "Campo TITULO deve ter entre 3 e 50 caracteres")
    private String titulo;


    public LivroDTO() {
        super();
    }

    public LivroDTO(Livro obj) {
        this.id = obj.getId();
        this.titulo = obj.getTitulo();

    }
    
    
    
}
