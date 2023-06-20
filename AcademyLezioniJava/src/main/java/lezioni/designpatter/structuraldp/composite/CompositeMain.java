package lezioni.designpatter.structuraldp.composite;

// Client code
public class CompositeMain {
    public static void main(String[] args) {
        Cerchio cerchio = new Cerchio();
        Tetraedo tetraedo = new Tetraedo();

        CompositeGrafica compositeGrafica = new CompositeGrafica();
        compositeGrafica.add(cerchio);
        compositeGrafica.add(tetraedo);

        compositeGrafica.disegna();
    }
}
