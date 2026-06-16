package com.jwss.studio.bffagendadortarefas.infrastructure.client;


import com.jwss.studio.bffagendadortarefas.buisness.dto.request.EnderecoDTORequest;
import com.jwss.studio.bffagendadortarefas.buisness.dto.request.LoginDTORequest;
import com.jwss.studio.bffagendadortarefas.buisness.dto.request.TelefoneDTORequest;
import com.jwss.studio.bffagendadortarefas.buisness.dto.request.UsuarioDTORequest;
import com.jwss.studio.bffagendadortarefas.buisness.dto.response.EnderecoDTOResponse;
import com.jwss.studio.bffagendadortarefas.buisness.dto.response.TelefoneDTOResponse;
import com.jwss.studio.bffagendadortarefas.buisness.dto.response.UsuarioDTOResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "usuario", url = "${usuario.url}")

public interface UsuarioClient {


    @GetMapping
    UsuarioDTOResponse buscaUsuarioPorEmail(@RequestParam("email") String email,
                                            @RequestHeader(name="Authorization",required=false) String token);


    @PostMapping
    UsuarioDTOResponse salvaUsuario(@RequestBody UsuarioDTORequest usuarioDTO);

    @PostMapping("/login")
  String login(@RequestBody LoginDTORequest usuarioDTO);


    @DeleteMapping("/{email}")
     Void deletaUsuarioPorEmail(@PathVariable String email,
                           @RequestHeader(name="Authorization",required=false) String token);


    @PutMapping
    UsuarioDTOResponse atualizaDadosUsuario(@RequestBody UsuarioDTORequest dto,
                                            @RequestHeader(name="Authorization",required=false) String token);


    @PutMapping("/endereco")
    EnderecoDTOResponse atualizaEndereco (@RequestBody EnderecoDTORequest dto,
                                          @RequestParam("id") Long id,
                                          @RequestHeader(name="Authorization",required=false) String token);
    @PutMapping("/telefone")
    TelefoneDTOResponse atualizaTelefone (@RequestBody TelefoneDTORequest dto,
                                          @RequestParam("id") Long id,
                                          @RequestHeader(name="Authorization",required=false) String token);
    @PostMapping("/endereco")
    EnderecoDTOResponse cadastraEndereco (@RequestBody EnderecoDTORequest dto,
                                          @RequestHeader(name="Authorization",required=false) String token);
    @PostMapping("/telefone")
    TelefoneDTOResponse cadastraTelefone (@RequestBody TelefoneDTORequest dto,
                                          @RequestHeader(name="Authorization",required=false) String token);

}
