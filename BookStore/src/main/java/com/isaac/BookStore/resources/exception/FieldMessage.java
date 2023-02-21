/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.isaac.BookStore.resources.exception;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author isaac
 */

@Getter
@Setter
public class FieldMessage implements Serializable {
    
    private static final long SerialVersionUID = 1L;
    
    private String fieldName;
    private String message;

    
    public FieldMessage(String fieldName, String message) {
        this.fieldName = fieldName;
        this.message = message;
    }
    
    public FieldMessage() {
        super();
    }
}
