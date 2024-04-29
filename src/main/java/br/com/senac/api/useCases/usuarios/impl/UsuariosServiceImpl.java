package br.com.senac.api.useCases.usuarios.impl;

import br.com.senac.api.frameWork.utils.SenacException;
import br.com.senac.api.useCases.usuarios.UsuariosBusiness;
import br.com.senac.api.useCases.usuarios.UsuariosService;
import br.com.senac.api.useCases.usuarios.domains.UsuariosLoginRequestDom;
import br.com.senac.api.useCases.usuarios.domains.UsuariosRequestDom;
import br.com.senac.api.useCases.usuarios.domains.UsuariosResponseDom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuariosServiceImpl implements UsuariosService {
    @Autowired
    private UsuariosBusiness usuariosBusiness;

    @Override
    public UsuariosResponseDom login(UsuariosLoginRequestDom usuario) throws SenacException {
        return usuariosBusiness.login(usuario);
    }

    @Override
    public UsuariosResponseDom criarUsuario(UsuariosRequestDom usuario) throws SenacException {
        return usuariosBusiness.criarUsuario(usuario);
    }
}
