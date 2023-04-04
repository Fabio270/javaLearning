import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("fabio", "gandula", 0);
        Time vasco = new Time("vasco","Brasil",0);
        vasco.adicionarJogador(j1);

        vasco.mostrarDados();

        List<Jogador> listateste = new ArrayList<>();
        Jogador j2 = new Jogador("Cleber", "zagueiro",3);
        Jogador j3 = new Jogador("Ricardo","atacante", 1);
        Jogador j4 = new Jogador("Lucas", "defensor", 5);

        listateste.add(j2);

        vasco.setJogadores(listateste);
        vasco.mostrarDados();

        vasco.adicionarJogador(j3,j4);
        vasco.mostrarDados();

        Estadio estadio = new Estadio("maracanã", "são paulo");

        Time saopaulo = new Time("São Paulo","Brasil",1);

        Jogador j5 = new Jogador("Bardo","goleiro",10);
        saopaulo.adicionarJogador(j5);

        Partida partidafinal = new Partida("12/12/2012","14:00",0,0,estadio,vasco,saopaulo);
        partidafinal.atualizarPlacar(partidafinal.getTime1());
        partidafinal.atualizarPlacar(partidafinal.getTime1());
        partidafinal.atualizarPlacar(partidafinal.getTime2());
        System.out.println();
        partidafinal.mostrarDados();
    }
}