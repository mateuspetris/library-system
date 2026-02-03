package model;

import enums.CategoriaItem;
import enums.StatusItem;

public class Revistas extends ItemBiblioteca{

    private int edicao;
    private String mesPublicacao;

    @Override
    public int calcularDiasMaximoEmprestimo() {
        return 7;
    }

    @Override
    public int calcularMultaPordia() {
        return 1;
    }

    public Revistas(CategoriaItem categoria, StatusItem status, int anoPublicacao, String autor, String titulo, String mesPublicacao, int edicao) {
        super(categoria, status, anoPublicacao, autor, titulo);
        this.mesPublicacao = mesPublicacao;
        this.edicao = edicao;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public String getMesPublicacao() {
        return mesPublicacao;
    }

    public void setMesPublicacao(String mesPublicacao) {
        this.mesPublicacao = mesPublicacao;
    }

    @Override
    public String toString() {
        return "Revistas{" +
                "edicao=" + edicao +
                ", mesPublicacao='" + mesPublicacao + '\'' +
                '}';
    }
}
