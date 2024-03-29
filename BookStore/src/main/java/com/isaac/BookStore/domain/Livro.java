/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.isaac.BookStore.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
@EqualsAndHashCode
@Entity
public class Livro implements Serializable {
    
    private static final long seriaVersionUID =1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)   
    private Integer id;
    
    @NotEmpty(message= "Campo TITULO é requerido")
    @Length(min = 3, max = 50, message= "Campo TITULO deve ter entre 3 e 50 caracteres")
    private String titulo;
    
    @NotEmpty(message= "Campo NOME DO AUTOR é requerido")
    @Length(min = 3, max = 50, message= "Campo NOME DO AUTOR deve ter entre 3 e 50 caracteres")
    private String nomeAutor;
    
    @NotEmpty(message= "Campo TEXTO é requerido")
    @Length(min = 10, max = 2000000, message= "Campo TEXTO deve ter entre 3 e 2000000 caracteres")
    private String texto;
    
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    public Livro() {
        super();
    }

    public Livro(Integer id, String titulo, String nomeAutor, String texto, Categoria categoria) {
        this.id = id;
        this.titulo = titulo;
        this.nomeAutor = nomeAutor;
        this.texto = texto;
        this.categoria = categoria;
    }
    
    
    
    
}
