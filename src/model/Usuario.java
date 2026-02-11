package model;

import dto.Emprestimo;
import enums.TipoUsuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public abstract class Usuario {

    final String cpf;
    private String nome;
    private TipoUsuario tipoUsuario;
    private List<Emprestimo> emprestimosAtivos;
    private Stack<Emprestimo> historicoEmprestimos;
    private double multasPendentes;

    public abstract int getLimiteEmprestimos();

    public boolean podeEmprestar(){

        if(multasPendentes > 0){
            return false;
        }

        if(emprestimosAtivos.size() >= getLimiteEmprestimos()){
            return false;
        }

        return true;

    }

    public void adicionarEmprestimo(Emprestimo emprestimo){
        emprestimosAtivos.add(emprestimo);
        historicoEmprestimos.push(emprestimo);

    }

    public void removerEmprestimo(Emprestimo emprestimo){
        emprestimosAtivos.remove(emprestimo);
    }

    public Usuario(String cpf, String nome, TipoUsuario tipoUsuario, List<Emprestimo> emprestimosAtivos, Stack<Emprestimo> historicoEmprestimos, double multasPendentes) {
        this.cpf = cpf;
        this.nome = nome;
        this.tipoUsuario = tipoUsuario;
        this.emprestimosAtivos = new ArrayList<>();
        this.historicoEmprestimos = new Stack<>();
        this.multasPendentes = multasPendentes;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public List<Emprestimo> getEmprestimosAtivos() {
        return emprestimosAtivos;
    }

    public void setEmprestimosAtivos(List<Emprestimo> emprestimosAtivos) {
        this.emprestimosAtivos = emprestimosAtivos;
    }

    public Stack<Emprestimo> getHistoricoEmprestimos() {
        return historicoEmprestimos;
    }

    public void setHistoricoEmprestimos(Stack<Emprestimo> historicoEmprestimos) {
        this.historicoEmprestimos = historicoEmprestimos;
    }

    public double getMultasPendentes() {
        return multasPendentes;
    }

    public void setMultasPendentes(double multasPendentes) {
        this.multasPendentes = multasPendentes;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", tipoUsuario=" + tipoUsuario +
                ", emprestimosAtivos=" + emprestimosAtivos +
                ", historicoEmprestimos=" + historicoEmprestimos +
                ", multasPendentes=" + multasPendentes +
                '}';
    }
}
