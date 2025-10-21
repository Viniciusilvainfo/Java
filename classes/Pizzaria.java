package classes;

public class Pizzaria implements Restaurante {

    @Override
    public void pedirComida(String comida) {
        System.out.println("Pedido de pizza: " + comida);
    }

    @Override
    public void pedirBebida(String bebida) {
        System.out.println("Pedido de bebida: " + bebida);
    }

}
