//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ExercicioPOO;

public class Caixa {
    private String nome;
    private int id;
    private Double preco;

    public Caixa(String nome, int id, Double preco) {
        this.nome = nome;
        this.id = id;
        this.preco = preco;
    }

    public Caixa() {
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getPreco() {
        return this.preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
