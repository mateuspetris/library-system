package repository;

import enums.CategoriaItem;
import enums.StatusItem;
import model.ItemBiblioteca;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ItemRepository {

    private HashSet<ItemBiblioteca> itens;

    public void adicionar(ItemBiblioteca itemBiblioteca){
        itens.add(itemBiblioteca);
    }

    public void remover(ItemBiblioteca itemBiblioteca){
        itens.remove(itemBiblioteca);
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

    public List<ItemBiblioteca> ListarDisponiveis(){
        List<ItemBiblioteca> disponiveis = new ArrayList<>();
        for(ItemBiblioteca item : itens){
            if(item.getStatus() == StatusItem.DISPONIVEL){
                disponiveis.add(item);
            }
        }
        return disponiveis;
    }

    public List<ItemBiblioteca> ListarCategoria(CategoriaItem categoria){
        List<ItemBiblioteca> categorias = new ArrayList<>();
        for(ItemBiblioteca item : itens){
            if(item.getCategoria().equals(categoria)){
                categorias.add(item);
            }
        }
        return categorias;
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
