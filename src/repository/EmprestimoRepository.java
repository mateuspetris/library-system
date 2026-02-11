package repository;

import dto.Emprestimo;
import model.Usuario;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class EmprestimoRepository {

    private LinkedHashSet<Emprestimo> emprestimos;

    public EmprestimoRepository() {
        this.emprestimos = new LinkedHashSet<>();
    }


    public void adicionar(Emprestimo emprestimo) {
        emprestimos.add(emprestimo);

    }

    public void remover(Emprestimo emprestimo){
        emprestimos.remove(emprestimo);
    }

    public void listarTodosEmprestimos(){
        System.out.println("\n--- Lista emprestimos---");
        for (Emprestimo emprestimo : emprestimos){
            System.out.println(emprestimo);
        }
    }

    public List<Emprestimo> buscarPorUsuario(Usuario usuario){
        List<Emprestimo> emprestimoPorUsuario = new ArrayList<>();
        for(Emprestimo emprestimo : emprestimos){
            if(emprestimo.usuario().equals(usuario)){
                emprestimoPorUsuario.add(emprestimo);
            }
        }
        return emprestimoPorUsuario;
    }

    public Emprestimo buscarEmprestimos(Emprestimo codigo){
        for(Emprestimo emprestimo : emprestimos){
            if(emprestimo.codigoEmprestimo() == codigo.codigoEmprestimo()){}
        }
        return null;
    }

    public boolean verificarEmprestimo(Emprestimo emprestimo){
        return buscarEmprestimos(emprestimo) != null;
    }







}
