package service;

import dto.Estatisticas;
import enums.CategoriaItem;
import model.ItemBiblioteca;
import repository.EmprestimoRepository;
import repository.ItemRepository;
import repository.UsuarioRepository;
import java.util.*;

public class BibilotecaService {

    private ItemRepository itemRepository;
    private EmprestimoRepository emprestimoRepository;
    private UsuarioRepository usuarioRepository;


    public BibilotecaService(){
        this.itemRepository = new ItemRepository();
        this.emprestimoRepository = new EmprestimoRepository();
        this.usuarioRepository = new UsuarioRepository();
    }

    public void cadastrarItem(ItemBiblioteca item){
        itemRepository.adicionar(item);
    }

    public void removerItem(ItemBiblioteca item){
        itemRepository.remover(item);
    }

    public ItemBiblioteca buscarItemPorCodigo(String codigo){
        return itemRepository.buscarPorCodigo(codigo);
    }

    public ItemBiblioteca buscarPorTitulo(String titulo){
        return itemRepository.buscarPorTitulo(titulo);

    }

    public List<ItemBiblioteca> listarItensDisponiveis(){
        return itemRepository.ListarDisponiveis();
    }

    public List<ItemBiblioteca> listarPorCategoria(CategoriaItem categoria){
        return itemRepository.ListarCategoria(categoria);
    }

    public Estatisticas gerarEstatisticas(){
        int totalItens = itemRepository.getItens().size();
        int disponiveis = listarItensDisponiveis().size();
        int emprestados = totalItens - disponiveis;
        int totalUsuarios = usuarioRepository.getUsuario().size();

        return new Estatisticas(totalItens, disponiveis,emprestados,totalUsuarios);

    }

}
