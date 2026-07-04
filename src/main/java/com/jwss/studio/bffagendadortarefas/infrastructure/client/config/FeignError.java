package com.jwss.studio.bffagendadortarefas.infrastructure.client.config;

import com.jwss.studio.bffagendadortarefas.infrastructure.exceptios.BusinessException;
import com.jwss.studio.bffagendadortarefas.infrastructure.exceptios.ConflictException;
import com.jwss.studio.bffagendadortarefas.infrastructure.exceptios.ResourceNotFoundException;
import com.jwss.studio.bffagendadortarefas.infrastructure.exceptios.UnauthorizedException;
import feign.Response;
import feign.codec.ErrorDecoder;

public class FeignError implements ErrorDecoder {
    @Override
    public Exception decode(String methodKey, Response response) {
        switch (response.status()) {

            case 409:
                return new ConflictException("Erro atributo já existente");
            case 403:
                return new ResourceNotFoundException("Erro atributo não encontrado");
            case 401:
                return new UnauthorizedException("Erro usuário não autorizado");
            default:
                return new BusinessException("Erro de servidor");
        }
    }
}
