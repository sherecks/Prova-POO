package dados;

public abstract class Animal{
    String nome;

    public String emitirSom(){
        return "";
    }

    // 1° -> Getters & Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
