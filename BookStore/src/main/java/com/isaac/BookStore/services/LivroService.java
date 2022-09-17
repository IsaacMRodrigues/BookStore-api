/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.isaac.BookStore.services;

import com.isaac.BookStore.domain.Livro;
import com.isaac.BookStore.repository.LivroRepository;
import com.isaac.BookStore.services.excptions.ObjectNotFoundException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivroService {
    @Autowired
    private LivroRepository repository;
    
    @Autowired
    private CategoriaService categoriaService;
    
    public Livro findById(Integer id) {
        Optional<Livro> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
        "Livro não encontrado! Id:" + id + ", Tipo: " + Livro.class.getName()));
    }
    public List<Livro> findAll(Integer id_cat){
        categoriaService.findById(id_cat);
        return repository.findAllByCategoria(id_cat);
    }

    public Livro update(Integer id, Livro obj) {
       Livro newObj = findById(id);
       updateData(newObj, obj);
       //salva os dados de newObj no banco
       return repository.save(newObj);
    }
    
    // atualiza os dados passando tudo para newObj
    private void updateData(Livro newObj, Livro obj) {
        newObj.setTitulo(obj.getTitulo());
        newObj.setNomeAutor(obj.getNomeAutor());
        newObj.setTexto(obj.getTexto());
    }
    
    
}
