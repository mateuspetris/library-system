package repository;

import model.ItemBiblioteca;

import java.util.HashSet;

public class ItemRepository {

    private HashSet<ItemBiblioteca> itens;

    public void adicionar(ItemBiblioteca itemBiblioteca){
        itens.add(itemBiblioteca);
    }

    public void remover(String codigo){
        itens.remove(codigo);
    }

    public ItemBiblioteca buscarPorCodigo(String codigo){

        for(ItemBiblioteca item : itens){
            if(item.getCodigo().equals(codigo)){
                return item;
            }
    }
        return null;
    }

    public ItemBiblioteca buscarPorTitulo(String titulo){
        for(ItemBiblioteca item : itens){
            if(item.getTitulo().equals(titulo)){
                return item;
            }
        }
        return null;
    }

    public void listarTodos(){
        System.out.println("\n------- ITENS DA BIBLIOTECA ------- ");
        for(ItemBiblioteca item : itens){
            System.out.println(item);
        }
    }

    public boolean existe(String codigo){
        return buscarPorCodigo(codigo) != null;
    }


    public ItemRepository(){
        this.itens = new HashSet<>();
    }

    public HashSet<ItemBiblioteca> getItens() {
        return itens;
    }

    public void setItens(HashSet<ItemBiblioteca> itens) {
        this.itens = itens;
    }
}
