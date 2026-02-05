package repository;

import model.Usuario;

import java.util.HashSet;

public class UsuarioRepository {

    private HashSet<Usuario> usuario;

    public UsuarioRepository(){
        this.usuario = new HashSet<>();
    }


}
