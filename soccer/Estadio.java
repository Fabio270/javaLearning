public class Estadio implements mostrarDados{
    private String nome;
    private String Cidade;

    public Estadio(String nome, String cidade) {
        this.nome = nome;
        Cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String cidade) {
        Cidade = cidade;
    }

    @Override
    public void mostrarDados() {
        System.out.println("\nNome: "+this.getNome() + "\nCidade: "+ this.getCidade());
    }
}
