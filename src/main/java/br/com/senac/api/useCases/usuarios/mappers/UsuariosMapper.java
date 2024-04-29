package br.com.senac.api.useCases.usuarios.mappers;

import br.com.senac.api.entitys.Usuarios;
import br.com.senac.api.useCases.usuarios.domains.UsuariosResponseDom;

public class UsuariosMapper {
    public static UsuariosResponseDom usuariosToUsuariosResponseDom(Usuarios in){
        UsuariosResponseDom out = new UsuariosResponseDom();
        out.setId(in.getId());
        out.setNome(in.getNome());
        out.setEmail(in.getEmail());

        return out;
    }
}
