public abstract class Animal {
    private String nome;
    private String som;

    public Animal(String nome, String som) {
        this.nome = nome;
        this.som = som;
    }

    public abstract void fazerSom();
}
