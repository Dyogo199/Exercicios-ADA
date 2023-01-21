package ExercicioPOO;

public class Livro extends Caixa {
    private String genero;
    private String escritor;
    private String editora;

    public Livro(String nome, int id, Double preco, String genero, String escritor, String editora) {
        super(nome, id, preco);
        this.genero = genero;
        this.escritor = escritor;
        this.editora = editora;
    }

    public Livro() {
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEscritor() {
        return this.escritor;
    }

    public void setEscritor(String escritor) {
        this.escritor = escritor;
    }

    public String getEditora() {
        return this.editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
}
