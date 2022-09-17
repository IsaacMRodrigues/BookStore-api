package com.isaac.BookStore.dtos;

import com.isaac.BookStore.domain.Livro;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class LivroDTO implements Serializable {
    
    private static final long seriaVersionUID = 1L;
    
    private Integer id;
    private String titulo;


    public LivroDTO() {
        super();
    }

    public LivroDTO(Livro obj) {
        this.id = obj.getId();
        this.titulo = obj.getTitulo();

    }
    
    
    
}
