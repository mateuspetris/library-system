package model;

import enums.TipoUsuario;

import java.util.List;
import java.util.Stack;

public class Estudante extends Usuario{

    public Estudante(String cpf, String nome, TipoUsuario tipoUsuario, List<Emprestimo> emprestimosAtivos, Stack<Emprestimo> historicoEmprestimos, double multasPendentes) {
        super(cpf, nome, tipoUsuario, emprestimosAtivos, historicoEmprestimos, multasPendentes);
    }

    @Override
    public int getLimiteEmprestimos() {
        return 3;
    }
}
