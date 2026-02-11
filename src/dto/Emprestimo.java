package dto;


import model.ItemBiblioteca;
import model.Usuario;

import java.time.LocalDate;


public record Emprestimo(long codigoEmprestimo, ItemBiblioteca item, Usuario usuario, LocalDate dataEmprestimo,
                         LocalDate dataDevolucaoPrevista, LocalDate dataDevolucaoReal, int multCalculada) {

}
