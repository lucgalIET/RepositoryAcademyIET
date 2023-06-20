package lezioni.designpatter.creationaldp.prototype;

public class EurovisionMain {
    public static void main(String[] args) {

        Cantante cantante = new CantanteLirico("Maria Callas","Con te partiro'");
        cantante.canta();

        Cantante cantante2 = cantante.cloneCantante();
        cantante.canta();
        cantante2.canta();

        System.out.println("\n");

        Cantante sfera = new CantanteTRap("Sfera","Sc sc");
        Cantante blanco = sfera.cloneCantante();
        sfera.canta();
        blanco.canta();
    }
}