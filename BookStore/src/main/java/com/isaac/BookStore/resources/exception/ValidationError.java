/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.isaac.BookStore.resources.exception;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author isaac
 */
@Getter
@Setter
public class ValidationError extends StandardError {

    
    private List<FieldMessage> errors = new ArrayList<>();
    public ValidationError() {
    }

    public ValidationError(Long timesTemp, Integer status, String error) {
        super(timesTemp, status, error);
    }
    
    
    public void addErrors(String fieldName, String message){
    
    this.errors.add(new FieldMessage(fieldName, message));
    }
}
