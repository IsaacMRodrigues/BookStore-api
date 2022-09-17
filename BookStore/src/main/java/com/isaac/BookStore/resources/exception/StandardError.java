/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.isaac.BookStore.resources.exception;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class StandardError {
    
    private Long timesTemp;
    private  Integer status;
    private String error;

    public StandardError() {
        super();
    }

    public StandardError(Long timesTemp, Integer status, String error) {
        this.timesTemp = timesTemp;
        this.status = status;
        this.error = error;
    }
    
    
    
    
    
}
