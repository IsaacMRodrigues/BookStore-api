
package com.isaac.BookStore.services;

import com.isaac.BookStore.domain.Categoria;
import com.isaac.BookStore.dtos.CategoriaDTO;
import com.isaac.BookStore.repository.CategoriaRepository;
import com.isaac.BookStore.services.excptions.DataIntegrityViolationExceptio;
import com.isaac.BookStore.services.excptions.ObjectNotFoundException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {
    
    @Autowired
    private CategoriaRepository repository;
    
    public Categoria findById(Integer id) {
        Optional<Categoria> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Categoria não encontrado! Id:" + id + ", Tipo: " + Categoria.class.getName()));
    }
    
    public List<Categoria> findAll(){
        return repository.findAll();
    }
    
    public Categoria create(Categoria obj){
        obj.setId(null);
        return repository.save(obj);
    }
    
    public Categoria update(Integer id, CategoriaDTO objDto){
        Categoria obj = findById(id);
        obj.setNome(objDto.getNome());
        obj.setDescricao(objDto.getDescricao());
        return repository.save(obj);
    }
    
    public void delete(Integer id){
        findById(id);
        try {
            repository.deleteById(id);
        } catch (DataIntegrityViolationException e) {
            throw new DataIntegrityViolationExceptio("Categoria possui livros associados e não pode ser deletada");
        }        
    }
    
}
