/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.isaac.BookStore.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;


@Getter
@Setter
@EqualsAndHashCode
@Entity
public class Categoria implements Serializable {
    
    private static final long seriaVersionUID =1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @NotEmpty(message= "Campo NOME é requerido")
    @Length(min = 3, max = 100, message= "Campo NOME deve ter entre 3 e 100 caracteres")
    private String nome;
    
    @NotEmpty(message= "Campo DESCRIÇÃO é requerido")
    @Length(min = 3, max = 200, message= "Campo DESCRIÇÃO deve ter entre 3 e 200 caracteres")
    private String descricao;
    
    @OneToMany(mappedBy = "categoria")
    private List<Livro> livros = new ArrayList<>();

    public Categoria() {
        super();
    }

    public Categoria(Integer id, String nome, String descricao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
    }
    
    
    
    
    
}
