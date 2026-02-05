package enums;

public enum StatusItem {
    DISPONIVEL("Disponivel para Empréstimo"),
    EMPRESTADO("Em posse de usuário"),
    RESERVADO("Reservado para retirada"),
    MANUTENCAO("Em manutenção");

    private String descricao;

    private StatusItem(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }

}
