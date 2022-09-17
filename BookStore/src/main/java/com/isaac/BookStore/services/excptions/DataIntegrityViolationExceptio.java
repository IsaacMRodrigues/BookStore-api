/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.isaac.BookStore.services.excptions;

/**
 *
 * @author isaac
 */
public class DataIntegrityViolationExceptio extends RuntimeException {
    private static final long seriaVersionUID =1L;

    public DataIntegrityViolationExceptio(String message) {
        super(message);
    }

    public DataIntegrityViolationExceptio(String message, Throwable cause) {
        super(message, cause);
    }
    
    
}
