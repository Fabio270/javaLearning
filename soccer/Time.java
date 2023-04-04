import java.util.ArrayList;
import java.util.List;

public class Time {
    private String nome;
    private String pais;
    private int quantidadeTitulos;
    private List<Jogador> vetorJogadores = new ArrayList<>();

    public Time(String nome, String pais, int quantidadeTitulos) {
        this.nome = nome;
        this.pais = pais;
        this.quantidadeTitulos = quantidadeTitulos;
    }
    public List<Jogador> getJogadores(){
        return vetorJogadores;
    }
    public void setJogadores(List<Jogador> jogadores){
        this.vetorJogadores.addAll(jogadores);
    }
    public void adicionarJogador(Jogador j){
        vetorJogadores.add(j);
    }

    public void adicionarJogador(Jogador ... jogadores){
        for (Jogador j:jogadores ){
            vetorJogadores.add(j);
        }
    }
    public void removerJogador(Jogador j){
        vetorJogadores.remove(j);
    }
    public  void mostrarDados(){
        System.out.println("\nNome do time: " + nome);
        System.out.println("País do time: "+ pais);
        System.out.println("Quantidade de Títulos: " + quantidadeTitulos);
        System.out.println("Jogadores: ");
        for(Jogador j:vetorJogadores){
            System.out.println(j.getNome());
        }
    }
    public void  setNome(String nome) {
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getQuantidadeTitulos() {
        return quantidadeTitulos;
    }

    public void setQuantidadeTitulos(int quantidadeTitulos) {
        this.quantidadeTitulos = quantidadeTitulos;
    }

    public List<Jogador> getVetorJogadores() {
        return vetorJogadores;
    }

    public void setVetorJogadores(List<Jogador> vetorJogadores) {
        this.vetorJogadores = vetorJogadores;
    }
}
