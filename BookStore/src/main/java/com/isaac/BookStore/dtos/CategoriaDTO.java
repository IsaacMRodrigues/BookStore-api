/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.isaac.BookStore.dtos;

import com.isaac.BookStore.domain.Categoria;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class CategoriaDTO implements Serializable {
    
    private static final long seriaVersionUID = 1L;
    
    private Integer id;
    private String nome;
    private String descricao;

    public CategoriaDTO() {
        super();
    }

    public CategoriaDTO(Categoria obj) {
        this.id = obj.getId();
        this.nome = obj.getNome();
        this.descricao = obj.getDescricao();
    }
    
    
    
}
