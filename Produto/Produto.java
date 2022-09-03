public class Produto {

    public String nome;
    public double preco;
    public int quantidade;

    public double valorTotalEmEstoque(){
        return quantidade * preco;
    }

    public void addProduto(int quantidade){
        this.quantidade += quantidade;
    }

    public void removerProduto(int quantidade){
        this.quantidade -= quantidade;
    }


}
