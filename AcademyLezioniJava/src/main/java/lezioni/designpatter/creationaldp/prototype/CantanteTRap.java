package lezioni.designpatter.creationaldp.prototype;

//prototipo concreto
public class CantanteTRap implements Cantante {

    private String nome;
    private String canzone;

    public CantanteTRap(String nome, String canzone) {
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
        System.out.println("Mama Sc Sc Sc Sc");
    }
}
