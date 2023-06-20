package lezioni.designpatter.structuraldp.composite;

import java.util.ArrayList;
import java.util.List;

// Composite
public class CompositeGrafica implements Grafica {

    private List<Grafica> listaGrafica = new ArrayList<>();

    public void add(Grafica grafica) {
        listaGrafica.add(grafica);
    }

    public void remove(Grafica grafica) {
        listaGrafica.remove(grafica);
    }

    @Override
    public void disegna() {
        System.out.println("Disegna gli elementi Grafica: \n");
        for (Grafica grafica : listaGrafica) {
            grafica.disegna();
        }
//        listaGrafica.forEach(x -> x.disegna());
    }
}
