package classes;

public class Carro {

    String modelo;
    String cor;

    public Carro(String modelo) {

        try {
            this.modelo = modelo;

            if (modelo == null || modelo.isEmpty()) {
                throw new Exception("Modelo inválido");
            }
            System.out.println("Objeto carro criado, modelo: " + modelo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
