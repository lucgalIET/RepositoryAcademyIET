package lezioni.lambda;

public class Persona {
    private String nome;
    private int eta;

    public Persona() {}

    public Persona(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    @Override
    public String toString() {
        return "Persona: " + "Nome: " + nome + ", " + "eta': " + eta+ ". ";
    }
}
