package model;

import Enums.CategoriaItem;
import Enums.StatusItem;

public class Livro extends ItemBiblioteca {

    // TODO
    final String isbn;
    private int numeroPaginas;
    private String editora;

    @Override
    public void calcularDiasMaximoEmprestimo() {


    }
    @Override
    public void calcularMultaPordia() {

    }

    public Livro(CategoriaItem categoria, StatusItem status, int anoPublicacao, String autor, String titulo, String isbn, int numeroPaginas, String editora) {
        super(categoria, status, anoPublicacao, autor, titulo);
        this.isbn = isbn;
        this.numeroPaginas = numeroPaginas;
        this.editora = editora;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "isbn='" + isbn + '\'' +
                ", numeroPaginas=" + numeroPaginas +
                ", editora='" + editora + '\'' +
                '}';
    }
}
