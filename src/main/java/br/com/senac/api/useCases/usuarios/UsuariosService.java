package br.com.senac.api.useCases.usuarios;

import br.com.senac.api.frameWork.utils.SenacException;
import br.com.senac.api.useCases.usuarios.domains.UsuariosLoginRequestDom;
import br.com.senac.api.useCases.usuarios.domains.UsuariosRequestDom;
import br.com.senac.api.useCases.usuarios.domains.UsuariosResponseDom;

public interface UsuariosService {
    UsuariosResponseDom login(UsuariosLoginRequestDom usuario) throws SenacException;
    UsuariosResponseDom criarUsuario(UsuariosRequestDom usuario) throws SenacException;
}
