package main.java.lezioni.designpatter.creationaldp.prototype;

public class CantanteLirico implements Cantante {

    private String nome;
    private String canzone;

    public CantanteLirico(String nome, String canzone) {
        this.nome = nome;
        this.canzone = canzone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCanzone() {
        return canzone;
    }

    public void setCanzone(String canzone) {
        this.canzone = canzone;
    }

    @Override
    public Cantante cloneCantante() {
        try {
            return (Cantante) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public void canta() {
        System.out.println(this.canzone);
    }
}
