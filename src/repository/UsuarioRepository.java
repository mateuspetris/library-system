package repository;

import model.Usuario;

import java.util.HashSet;

public class UsuarioRepository {

    private HashSet<Usuario> usuario;

    public UsuarioRepository(){
        this.usuario = new HashSet<>();
    }

    public void adicionar(Usuario usuario){
        this.usuario.add(usuario);
    }

    public void remover(Usuario usuario){
        this.usuario.remove(usuario);
    }

    public void listar(){
        System.out.println("Lista de usuarios");
        for(Usuario user : usuario){
            System.out.println(user);
        }
    }

    public Usuario buscarPorCpf(String cpf){
        for (Usuario user : usuario){
            if (user.getCpf().equals(cpf)){
                return user;
            }
        }
        return null;
    }

    public boolean verificarCpf(String cpf){
        return buscarPorCpf(cpf) != null;
    }

    public HashSet<Usuario> getUsuario(){
        return usuario;
    }




}
