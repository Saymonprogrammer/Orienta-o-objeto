public class Gato extends Animal {
    public Gato(String nome, String som) {
        super(nome, som);
    }

    @Override
    public void fazerSom(){
        System.out.println("Miau!");
    }
}
