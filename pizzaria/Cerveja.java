public class Cerveja extends Bebida {
    private double teorAlcoolico;

    public Cerveja(int quantidadeEstoque, String descricao, double preco, double teorAlcoolico) {
        super(quantidadeEstoque, descricao, preco);
        this.setTeorAlcoolico(teorAlcoolico);
    }

    @Override
    public void mostrarDados() {
        System.out.println("\nDescrição: " + this.getDescricao() + "\nPreço: " + this.getPreco() + "\nQuantidade Estoque: " + this.getQuantidadeEstoque()
        + "\nTeor alcoólico: " + this.getTeorAlcoolico());
    }

    public double getTeorAlcoolico() {
        return teorAlcoolico;
    }

    public void setTeorAlcoolico(double teorAlcoolico) {
        this.teorAlcoolico = teorAlcoolico;
    }
}
