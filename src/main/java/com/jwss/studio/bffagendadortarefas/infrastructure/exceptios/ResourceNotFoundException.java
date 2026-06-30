package com.jwss.studio.bffagendadortarefas.infrastructure.exceptios;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String mensagem) {

        super(mensagem);
    }

    public ResourceNotFoundException(String mensagem, Throwable throwable) {
        super(mensagem, throwable);
    }

}
