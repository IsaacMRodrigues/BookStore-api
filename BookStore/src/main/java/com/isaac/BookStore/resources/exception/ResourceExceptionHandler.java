/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.isaac.BookStore.resources.exception;

import com.isaac.BookStore.services.excptions.DataIntegrityViolationExceptio;
import com.isaac.BookStore.services.excptions.ObjectNotFoundException;
import javax.servlet.ServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 *
 * @author isaac
 */

@ControllerAdvice
public class ResourceExceptionHandler {
    
    @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<StandardError> ObjectNotFoundException(ObjectNotFoundException e, ServletRequest request){
        StandardError error = new StandardError(
                System.currentTimeMillis(), 
                HttpStatus.NOT_FOUND.value(), 
                e.getMessage());      
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }
    @ExceptionHandler(DataIntegrityViolationExceptio.class)
    public ResponseEntity<StandardError> dataIntegrityViolationExceptio(DataIntegrityViolationExceptio e, ServletRequest request){
        StandardError error = new StandardError(
                System.currentTimeMillis(), 
                HttpStatus.BAD_REQUEST.value(), 
                e.getMessage());      
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
    }
    
}
