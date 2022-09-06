/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.isaac.BookStore.services;

import com.isaac.BookStore.domain.Categoria;
import com.isaac.BookStore.domain.Livro;
import com.isaac.BookStore.repository.CategoriaRepository;
import com.isaac.BookStore.repository.LivroRepository;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBService {
    
    @Autowired
    private CategoriaRepository cr;
    @Autowired
    private LivroRepository lr;
    
    public void instanciaBaseDeDados() {
        
        Categoria cat1 = new Categoria(null, "Informática", "Livro T.I");
        Categoria cat2 = new Categoria(null, "Mecanica", "Livro de Mecanica");
        Categoria cat3 = new Categoria(null, "Eletrica", "Livro de Eletrica");
        
        Livro l1 = new Livro(null,"JAVA CODE", "JOAOZIN", "teste", cat1);
        Livro l2 = new Livro(null,"FERRAMENTAS", "MADERA", "teste", cat2);
        Livro l3 = new Livro(null,"PROJETO ELETRICO", "ALEXAND", "teste", cat3);
        
        cat1.getLivros().addAll(Arrays.asList(l1));
        cat2.getLivros().addAll(Arrays.asList(l2));
        cat3.getLivros().addAll(Arrays.asList(l3));
        
        cr.save(cat1);
        cr.save(cat2);
        cr.save(cat3);
        lr.save(l1);
        lr.save(l2);
        lr.save(l3);
       
    
    }
    
}
