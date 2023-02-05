/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.isaac.BookStore.dtos;

import com.isaac.BookStore.domain.Categoria;
import java.io.Serializable;
import javax.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;


@Getter
@Setter
public class CategoriaDTO implements Serializable {
    
    private static final long seriaVersionUID = 1L;
    
    private Integer id;
    
    @NotEmpty(message= "Campo NOME é requerido")
    @Length(min = 3, max = 100, message= "Campo NOME deve ter entre 3 e 100 caracteres")
    private String nome;
    
    @NotEmpty(message= "Campo DESCRIÇÃO é requerido")
    @Length(min = 3, max = 200, message= "Campo DESCRIÇÃO deve ter entre 3 e 200 caracteres")
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
