public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    public  Carro(String marca, String modelo, int ano) {
        this.marca = marca;
    }
    public void getDescricao() {
        System.out.println("Marca: " + marca+"\nModelo: "+modelo+"\nAno: "+ano);
    }
}
