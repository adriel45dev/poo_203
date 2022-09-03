public class Programa {

    public static void main(String[] args) {

        Produto p = new Produto();
        p.nome = "TV";
        p.preco = 5000.00;
        p.quantidade = 20;

        System.out.println("O valor total em estoque é: " + p.valorTotalEmEstoque());
        p.removerProduto(10);
        System.out.println("O valor total em estoque é: " + p.valorTotalEmEstoque());
        p.addProduto(50);
        System.out.println("O valor total em estoque é: " + p.valorTotalEmEstoque());


    }
}
