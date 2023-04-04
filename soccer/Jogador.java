public class Jogador {
    private String nome;
    private String posicao;
    private int numerocamisa;

    public Jogador(String nome, String posicao, int numerocamisa) {
        this.nome = nome;
        this.posicao = posicao;
        this.numerocamisa = numerocamisa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public int getNumerocamisa() {
        return numerocamisa;
    }

    public void setNumerocamisa(int numerocamisa) {
        this.numerocamisa = numerocamisa;
    }
}
