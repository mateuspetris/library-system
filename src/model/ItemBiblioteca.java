package model;

import enums.CategoriaItem;
import enums.StatusItem;

public abstract class ItemBiblioteca {

    // TODO - ATRIBUTOS QUE INCLUEM CÓDIGOS SEPARANDO REVISTAS DE LIVROS
    private String titulo;
    private String autor;
    final String codigo;
    private int anoPublicacao;
    private int quantidadeDisponivel;
    private StatusItem status;
    private CategoriaItem categoria;

    // TODO - MÉTODOS ABSTRATOS
    public abstract int calcularDiasMaximoEmprestimo();
    public abstract int calcularMultaPordia();

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




    public ItemBiblioteca(CategoriaItem categoria, StatusItem status, int anoPublicacao, String autor, String titulo, String codigo, int quantidadeDisponivel) {
        this.categoria = categoria;
        this.status = status;
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
        this.titulo = titulo;
        this.codigo = codigo;
        this.quantidadeDisponivel = quantidadeDisponivel;
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

    public String getCodigo(){
        return codigo;
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

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public void setQuantidadeDisponivel(int quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
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
