import java.util.ArrayList;
import java.util.List;

public class Pizza extends Produto{
    private boolean bordaRecheada;
    private List<Ingrediente> vetorIngredientes = new ArrayList<>();

    public Pizza(boolean bordaRecheada, String descricao, Double preco){
        super(descricao,preco);
        this.bordaRecheada = bordaRecheada;
    }

    public Pizza(boolean bordaRecheada, String descricao, Double preco,List<Ingrediente> vetorIngredientes){
        super(descricao,preco);
        this.bordaRecheada = bordaRecheada;
        this.vetorIngredientes = vetorIngredientes;
    }

    public void adicionarIngrediente(Ingrediente...ingredientes){
        for (Ingrediente i:ingredientes){
            this.vetorIngredientes.add(i);
        }
    }

    public boolean isBordaRecheada() {
        return bordaRecheada;
    }

    public void setBordaRecheada(boolean bordaRecheada) {
        this.bordaRecheada = bordaRecheada;
    }

    public List<Ingrediente> getVetorIngredientes() {
        return vetorIngredientes;
    }

    public void setVetorIngredientes(List<Ingrediente> vetorIngredientes) {
        this.vetorIngredientes = vetorIngredientes;
    }

    @Override
    public void mostrarDados() {
        System.out.println("\nIngredientes: ");
        for (Ingrediente i:this.vetorIngredientes){
            System.out.print(i.getNome() + ", ");
        }
        if (this.bordaRecheada)
            System.out.println("borda recheada.");
        else
            System.out.println("borda normal.");
        System.out.println("Preço: " + this.getPreco());
        System.out.println("Descrição: " + this.getDescricao());
    }
}
