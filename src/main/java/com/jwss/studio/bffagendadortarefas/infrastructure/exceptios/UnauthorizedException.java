package com.jwss.studio.bffagendadortarefas.infrastructure.exceptios;


public class UnauthorizedException extends RuntimeException {
    public UnauthorizedException(String mensagem) {
        super(mensagem);
    }

    public UnauthorizedException(String mensagem, Throwable throwable) {
        super(mensagem, throwable);
    }
}
