package classes.abstratas;

public class Humano extends SerVivo {

    public Humano(String nome) {
        super(nome);
    }

    @Override
    public void respirar() {
        System.out.println("O humano está respirando.");
    }

}
