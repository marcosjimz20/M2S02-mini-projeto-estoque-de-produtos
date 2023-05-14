package Entidades;

public class Produtos {

    private String nomeProduto;

    private Double precoProduto;

    private Integer qtdEstoque;

    //INICIO DO CONSTRUCTOR
    public Produtos(String nomeProduto, Double precoProduto, Integer qtdEstoque) {
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.qtdEstoque = qtdEstoque;

        System.out.println(">>> Nova instancia da classe \"Produtos\" criada <<<");

    }
    //FIM DO CONSTRUCTOR

    //INICI0 MÉTODOS GET & SET
    public String getNomeProduto(){ return nomeProduto; }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Double getPrecoProduto() { return precoProduto; }

    public void setPrecoProduto(Double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public Integer getQtdEstoque() { return qtdEstoque; }

    public void setQtdEstoque(Integer qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }
    //FIM MÉTODOS GET & SET

    //INICIO MÉTODO PARA ADICIONAR PRODUTO AO ESTOQUE
    public String addEstoque(int addQtdProduto) {
        this.qtdEstoque += addQtdProduto;
        return "Foi adicionado " + addQtdProduto + "un do produto " + getNomeProduto() + " ao estoque.";
    }
    //FIM MÉTODO PARA ADICIONAR PRODUTO AO ESTOQUE

    //INICIO MÉTODO PARA REMOVER PRODUTO AO ESTOQUE
    public String removeEstoque(int removerQtdProduto) {
        this.qtdEstoque -= removerQtdProduto;
        return removerQtdProduto + "un do produto " + getNomeProduto() + " foi retirada do estoque.";
    }
    //FIM MÉTODO PARA REMOVER PRODUTO AO ESTOQUE

    //INICIO MÉTODO VALOR TOTAL DO ESTOQUE
    public String valorTotalEstoque() { return "TOTAL DE ITEMS NO ESTOQUE: " + getQtdEstoque() + "un."; }
    //FIM MÉTODO VALOR TOTAL DO ESTOQUE

    //INICIO MÉTODO ToSTRING
    public String toString() {
        return "PRODUTO: " + getNomeProduto() + ", PRECO: R$ " + getPrecoProduto() + ", " + valorTotalEstoque();
    }
    //FIM MÉTODO ToSTRING








}
