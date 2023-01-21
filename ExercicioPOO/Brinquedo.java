package ExercicioPOO;

public class Brinquedo extends Caixa {
    private String tipo;

    public Brinquedo(String nome, int id, Double preco, String tipo) {
        super(nome, id, preco);
        this.tipo = tipo;
    }

    public Brinquedo() {
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
