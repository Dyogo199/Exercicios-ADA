package ExercicioPOO;

public class AlbumDeMusica extends Caixa {
    private String musicosBanda;
    private String genero;
    private String selo;

    public AlbumDeMusica(String nome, int id, Double preco, String musicosBanda, String genero, String selo) {
        super(nome, id, preco);
        this.musicosBanda = musicosBanda;
        this.genero = genero;
        this.selo = selo;
    }

    public AlbumDeMusica() {
    }

    public String getMusicosBanda() {
        return this.musicosBanda;
    }

    public void setMusicosBanda(String musicosBanda) {
        this.musicosBanda = musicosBanda;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSelo() {
        return this.selo;
    }

    public void setSelo(String selo) {
        this.selo = selo;
    }
}
