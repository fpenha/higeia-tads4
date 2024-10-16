package com.fpenha.higeia.dominio;

public class DominioException extends Exception {
    
    // constrói uma exceção DominioException com a mensagem passada por parâmetro
    public DominioException(String msg){
        super(msg);
    }

    // constrói uma exceção DominioException com a mensagem e a causa dessa exceção, utilizado para encadear exceptions
    public DominioException(String msg, Throwable cause){
        super(msg, cause);
    }
}
