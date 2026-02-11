package service;

import dto.Emprestimo;
import enums.*;
import model.*;
import repository.*;

import java.time.LocalDate;
import java.util.*;

public class EmprestimoService {

    private Queue<Emprestimo> filaReservas;
    private HashSet<Emprestimo> emprestimosAtivos;
    private LinkedList<Emprestimo> historicoGeral;

    public EmprestimoService(){
        this.filaReservas = new LinkedList<>();
        this.emprestimosAtivos = new HashSet<>();
        this.historicoGeral = new LinkedList<>();
    }

    //TODO - METODO AUXILIAR
    private int contarEmprestimoPorUsuario(Usuario usuario){
        int contador = 0;
        for(Emprestimo emprestimo : emprestimosAtivos){
            if(emprestimo.usuario().equals(usuario)){
                contador ++;
            }
        }
        return contador;
    }

    public void relizarEmprestimo(Usuario usuario, ItemBiblioteca item){
        if(item.getStatus() != StatusItem.DISPONIVEL){
            System.out.println("Item Indisponivel");
            return;
        }
        if(contarEmprestimoPorUsuario(usuario) >= 3){
            System.out.println("Limite de empréstimos atingido!");
            return;
        }

        Emprestimo novoEmprestimo = new Emprestimo(0,item,usuario, LocalDate.now(),LocalDate.now().plusDays(14),null,0);

        emprestimosAtivos.add(novoEmprestimo);

        item.setStatus(StatusItem.EMPRESTADO);

        System.out.println("Emprestimo Realizado com Sucesso");

    }





}
