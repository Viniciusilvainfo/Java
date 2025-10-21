package classes.abstratas;

public abstract class SerVivo {

    private String nome;

    public SerVivo(String nome) {
        this.nome = nome;
    }

    public abstract void respirar();

}
