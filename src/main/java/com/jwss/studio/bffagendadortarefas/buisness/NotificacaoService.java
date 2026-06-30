package com.jwss.studio.bffagendadortarefas.buisness;


import com.jwss.studio.bffagendadortarefas.buisness.dto.response.TarefasDTOResponse;
import com.jwss.studio.bffagendadortarefas.infrastructure.client.NotificacaoClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class NotificacaoService {

    private final NotificacaoClient notificacaoClient;


    public void enviaEmail(TarefasDTOResponse dto) {

        notificacaoClient.enviarEmail(dto);
    }


}
