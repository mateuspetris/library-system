package model;

import enums.CategoriaItem;
import enums.StatusItem;

public class Dvd extends ItemBiblioteca{

    private int duracao;
    private String diretor;
    private int classificacao;

    @Override
    public int calcularDiasMaximoEmprestimo() {
        return 5;
    }

    @Override
    public int calcularMultaPordia() {
    return 3;
    }

    public Dvd(CategoriaItem categoria, StatusItem status, int anoPublicacao, String autor, String titulo) {
        super(categoria, status, anoPublicacao, autor, titulo);
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    @Override
    public String toString() {
        return "Dvd{" +
                "duracao=" + duracao +
                ", diretor='" + diretor + '\'' +
                ", classificacao=" + classificacao +
                '}';
    }
}
