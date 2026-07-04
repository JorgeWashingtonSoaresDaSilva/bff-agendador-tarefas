package com.jwss.studio.bffagendadortarefas.infrastructure.exceptios;


public class BusinessException extends RuntimeException {
    public BusinessException(String mensagem) {
        super(mensagem);
    }

    public BusinessException(String mensagem, Throwable throwable) {
        super(mensagem, throwable);
    }
}
