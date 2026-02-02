package model;

import Enums.CategoriaItem;
import Enums.StatusItem;

public abstract class ItemBiblioteca {

    // TODO - ATRIBUTOS QUE INCLUEM CÓDIGOS SEPARANDO REVISTAS DE LIVROS
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private int quantidadeDisponivel;
    private StatusItem status;
    private CategoriaItem categoria;

    // TODO - MÉTODOS ABSTRATOS
    public abstract void calcularDiasMaximoEmprestimo();
    public abstract void calcularMultaPordia();

    // TODO - MÉTODOS

    public void emprestar(){
        if(quantidadeDisponivel > 0){
            quantidadeDisponivel--;
            status = StatusItem.EMPRESTADO;
        }
    }

    public void devolver(){
        quantidadeDisponivel++;
        status = StatusItem.DISPONIVEL;

    }


    // TODO - CONSTRUTORES PARA INICIALIZAR OS ATRIBUTOS. UM NO ARGS E OUTRO ALL ARGS E GETTERS E SETTERS s

    public ItemBiblioteca(CategoriaItem categoria, StatusItem status, int anoPublicacao, String autor, String titulo) {
        this.categoria = categoria;
        this.status = status;
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public StatusItem getStatus() {
        return status;
    }

    public void setStatus(StatusItem status) {
        this.status = status;
    }

    public CategoriaItem getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaItem categoria) {
        this.categoria = categoria;
    }


    @Override
    public String toString() {
        return "ItemBiblioteca{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                ", status=" + status +
                ", categoria=" + categoria +
               '}';
    }
}
