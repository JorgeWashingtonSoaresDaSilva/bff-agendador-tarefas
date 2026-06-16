package com.jwss.studio.bffagendadortarefas.buisness;

import com.jwss.studio.bffagendadortarefas.buisness.dto.request.EnderecoDTORequest;
import com.jwss.studio.bffagendadortarefas.buisness.dto.request.LoginDTORequest;
import com.jwss.studio.bffagendadortarefas.buisness.dto.request.TelefoneDTORequest;
import com.jwss.studio.bffagendadortarefas.buisness.dto.request.UsuarioDTORequest;
import com.jwss.studio.bffagendadortarefas.buisness.dto.response.EnderecoDTOResponse;
import com.jwss.studio.bffagendadortarefas.buisness.dto.response.TelefoneDTOResponse;
import com.jwss.studio.bffagendadortarefas.buisness.dto.response.UsuarioDTOResponse;
import com.jwss.studio.bffagendadortarefas.infrastructure.client.UsuarioClient;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class UsuarioService {

    private final UsuarioClient client;

    public UsuarioDTOResponse salvaUsuario(UsuarioDTORequest usuarioDTO){

        return client.salvaUsuario(usuarioDTO);
    }

    public String loginUsuario(LoginDTORequest usuarioDTO){
        return client.login(usuarioDTO);
    }



    public UsuarioDTOResponse buscaUsuarioPorEmail(String email, String token){
        return client.buscaUsuarioPorEmail(email, token);
    }

    public void deletaUsuarioPorEmail(String email, String token){

        client.deletaUsuarioPorEmail(email, token);
    }

    public UsuarioDTOResponse atualizacoesUsuario(String token, UsuarioDTORequest dto){
        return client.atualizaDadosUsuario(dto, token);
    }

    public EnderecoDTOResponse atualizaEndereco(Long idEndereco, EnderecoDTORequest enderecoDTO, String token){
        return client.atualizaEndereco(enderecoDTO,idEndereco,token);
    }
    public TelefoneDTOResponse atualizaTelefone (Long idTelefone, TelefoneDTORequest telefoneDTO, String token){
       return client.atualizaTelefone(telefoneDTO, idTelefone, token);
    }

    public EnderecoDTOResponse cadastraEndereco(String token, EnderecoDTORequest dto){
       return client.cadastraEndereco(dto, token);
    }
    public TelefoneDTOResponse cadastraTelefone (String token, TelefoneDTORequest dto){
       return client.cadastraTelefone(dto, token);
    }


}
