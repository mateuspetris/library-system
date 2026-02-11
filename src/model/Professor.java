package model;

import dto.Emprestimo;
import enums.TipoUsuario;

import java.util.List;
import java.util.Stack;

public class Professor extends Usuario{

    private String departamento;


    @Override
    public int getLimiteEmprestimos() {
        return 0;
    }

    public Professor(String cpf, String nome, TipoUsuario tipoUsuario, List<Emprestimo> emprestimosAtivos, Stack<Emprestimo> historicoEmprestimos, double multasPendentes, String departamento) {
        super(cpf, nome, tipoUsuario, emprestimosAtivos, historicoEmprestimos, multasPendentes);
        this.departamento = departamento;
    }


    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
