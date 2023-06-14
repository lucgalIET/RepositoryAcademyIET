package main.java.lezioni.complessita;

public class ListaRicorsiva {

    public static void main(String[] args) {

        Nodo nodo1 = new Nodo("Sono il vcalore del Nodo 1");
        Nodo nodo2 = new Nodo("Sono il vcalore del Nodo 2");
        Nodo nodo3 = new Nodo("Sono il vcalore del Nodo 3");
        Nodo nodo4 = new Nodo("Sono il vcalore del Nodo 3");
        Nodo nodo5 = new Nodo("Sono il vcalore del Nodo 3");

        nodo1.setNodoSuccessivo(nodo2);
        nodo2.setNodoSuccessivo(nodo3);
        nodo3.setNodoSuccessivo(nodo4);
        nodo4.setNodoSuccessivo(nodo5);

        stampaNodi(nodo1);

        System.out.println(contaNodi(nodo1));

    }

    public static void stampaNodi(Nodo nodo) {
        if (nodo == null) return;

        System.out.println(nodo.getValore());
        stampaNodi(nodo.getNodoSuccessivo());
    }

    public static int contaNodi(Nodo nodo) {
        if (nodo == null) return 0;
        return 1 + contaNodi(nodo.getNodoSuccessivo());
    }
}
