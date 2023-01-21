package ExercicioPOO;

public class Jogo extends Caixa {
    private String distribuidora;
    private String genero;
    private String estudio;

    public Jogo(String nome, int id, Double preco, String distribuidora, String genero, String estudio) {
        super(nome, id, preco);
        this.distribuidora = distribuidora;
        this.genero = genero;
        this.estudio = estudio;
    }

    public Jogo() {
    }

    public String getDistribuidora() {
        return this.distribuidora;
    }

    public void setDistribuidora(String distribuidora) {
        this.distribuidora = distribuidora;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEstudio() {
        return this.estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }
}
