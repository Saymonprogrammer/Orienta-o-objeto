public class Cachorro extends Animal {
    public Cachorro(String nome, String som) {
        super(nome, som);
    }

    @Override
    public void fazerSom(){
        System.out.println("Au au!");
    }
}
