import Entidades.Produtos;

public class Main {
    public static void main(String[] args) {

        Produtos produto001 = new Produtos("", 0.0, 0);

        produto001.setNomeProduto("Relogio Casio Illuminator Mwa-100h-1avdf");
        produto001.setPrecoProduto(298.23);
        produto001.setQtdEstoque(50);

        System.out.println(
                "PRODUTO: " + produto001.getNomeProduto() +
                        ", PRECO: R$ " + produto001.getPrecoProduto() +
                        ", ESTOQUE: " + produto001.getQtdEstoque() + "un."

        );

        System.out.println(produto001.addEstoque(25));
        System.out.println(produto001.removeEstoque(34));
        System.out.println(produto001.valorTotalEstoque());

        System.out.println("___________________________");
        System.out.println(produto001.toString());




    }
}
