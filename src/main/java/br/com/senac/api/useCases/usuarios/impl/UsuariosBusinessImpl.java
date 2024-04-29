package br.com.senac.api.useCases.usuarios.impl;

import br.com.senac.api.entitys.Usuarios;
import br.com.senac.api.frameWork.annotions.Business;
import br.com.senac.api.frameWork.utils.SenacException;
import br.com.senac.api.useCases.usuarios.UsuariosBusiness;
import br.com.senac.api.useCases.usuarios.domains.UsuariosLoginRequestDom;
import br.com.senac.api.useCases.usuarios.domains.UsuariosRequestDom;
import br.com.senac.api.useCases.usuarios.domains.UsuariosResponseDom;
import br.com.senac.api.useCases.usuarios.impl.repositorys.UsuariosRepository;
import br.com.senac.api.useCases.usuarios.mappers.UsuariosMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Business
public class UsuariosBusinessImpl implements UsuariosBusiness {

    @Autowired
    private UsuariosRepository usuariosRepository;

    @Override
    public UsuariosResponseDom login(UsuariosLoginRequestDom usuario) throws SenacException {
        List<String> mensagens = this.validarLogin(usuario);
        if(!mensagens.isEmpty()){
            throw new SenacException(mensagens);
        }

        Usuarios result = usuariosRepository.findByEmail(usuario.getUsuario());
        if(Objects.isNull(result)){
            throw new SenacException("Usuário não encontrado");
        }

        if(!result.equals(usuario.getUsuario())){
            throw new SenacException("Senha invalida");
        }

        return UsuariosMapper.usuariosToUsuariosResponseDom(result);
    }

    @Override
    public UsuariosResponseDom criarUsuario(UsuariosRequestDom usuario) throws SenacException{
        return null;
    }

    private List<String> validarLogin(UsuariosLoginRequestDom usuario){
        List<String> mensagens = new ArrayList<>();

        if(Objects.isNull(usuario.getUsuario())){
            mensagens.add("Usuário não informado");
        }

        if(Objects.isNull(usuario.getSenha())){
            mensagens.add("Senha não informada");
        }

        return mensagens;
    }
}
