package com.jwss.studio.bffagendadortarefas.infrastructure.client;


import com.jwss.studio.bffagendadortarefas.buisness.dto.response.TarefasDTOResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "notificacao", url = "${notificacao.url}")

public interface NotificacaoClient {

    @PostMapping
    Void enviarEmail(@RequestBody TarefasDTOResponse dto);


}
