public class Vinho extends Bebida{
    private String uva;
    private String paisOrigem;

    public Vinho(int quantidadeEstoque, String descricao, double preco, String uva, String paisOrigem) {
        super(quantidadeEstoque, descricao, preco);
        this.uva = uva;
        this.paisOrigem = paisOrigem;
    }

    @Override
    public void mostrarDados() {
        System.out.println("\nTipo de uva: "+this.getUva()+"\nPais de Origem: "+this.getPaisOrigem()+"\nDescrição: "+this.getDescricao()
        + "\nQuantidade no Estoque: " + this.getQuantidadeEstoque() + "\nPreço: " + this.getPreco());
    }

    public String getUva() {
        return uva;
    }

    public void setUva(String uva) {
        this.uva = uva;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }
}
