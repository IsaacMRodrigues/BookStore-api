
package com.isaac.BookStore.services.excptions;

/**
 *
 * @author isaac
 */


public class ObjectNotFoundException extends RuntimeException {
    
    private static final long seriaVersionUID =1L;

    public ObjectNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public ObjectNotFoundException(String message) {
        super(message);
    }
    
    
    
}
