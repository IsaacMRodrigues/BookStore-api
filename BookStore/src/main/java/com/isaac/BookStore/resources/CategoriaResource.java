
package com.isaac.BookStore.resources;

import com.isaac.BookStore.domain.Categoria;
import com.isaac.BookStore.dtos.CategoriaDTO;
import com.isaac.BookStore.services.CategoriaService;
import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@CrossOrigin("*")
@RestController
@RequestMapping("/categorias")
public class CategoriaResource {
    
    @Autowired
    private CategoriaService service;
    
    @GetMapping("/{id}")
    public ResponseEntity<Categoria> findById(@PathVariable Integer id){
        Categoria obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
    
    @GetMapping
    public ResponseEntity<List<CategoriaDTO>> findAll(){
        List<Categoria> list = service.findAll();
        List<CategoriaDTO> listDTO = list.stream()
                .map(obj -> new CategoriaDTO(obj))
                .collect(Collectors.toList());
        
        return ResponseEntity.ok().body(listDTO);
    }
    
    @PostMapping
    public ResponseEntity<Categoria> create(@Valid @RequestBody Categoria obj){
        obj = service.create(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }
    
    public ResponseEntity<CategoriaDTO> update(@Valid @PathVariable Integer id, @RequestBody CategoriaDTO objDto){
        Categoria newObj = service.update(id, objDto);
        return ResponseEntity.ok().body(new CategoriaDTO(newObj));
    }
    
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
    
}

//localhost:8080/categoria/(id)