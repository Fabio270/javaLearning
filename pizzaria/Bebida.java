public abstract class Bebida extends Produto{
    private int quantidadeEstoque;

    public Bebida(int quantidadeEstoque, String descricao, double preco) {
        super(descricao, preco);
        this.setQuantidadeEstoque(quantidadeEstoque);
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
}
