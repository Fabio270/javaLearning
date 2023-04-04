import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Ingrediente ingrediente1 = new Ingrediente("tomate");
        Ingrediente ingrediente2 = new Ingrediente("queijo");

        Pizza tradicional = new Pizza(true, "Pizza normal",30.00);

        tradicional.adicionarIngrediente(ingrediente1,ingrediente2);

        tradicional.mostrarDados();

        Vinho vinho1 = new Vinho(10,"Vinho frisante da frança", 99.00,"Uva verde","França");
        vinho1.mostrarDados();

        Cerveja cerveja1 = new Cerveja(10, "Cerveja amanteigada", 15.00, 7.0);
        cerveja1.mostrarDados();


        System.out.println("\n--------------teste do polimorfismo----------------");

        List<Produto> listaprodutos = new ArrayList<>();
        listaprodutos.add(tradicional);
        listaprodutos.add(vinho1);
        listaprodutos.add(cerveja1);

        for (Produto p:listaprodutos){
            p.mostrarDados();
        }
    }
}