package lezioni.tipigenerici;

import java.util.ArrayList;
import java.util.List;

// esempio di classe generica con una lista
public class ListaGenerica<T> {

    private List<T> listaElementi = new ArrayList<>();

    public ListaGenerica(){}

    public ListaGenerica(List<T> listaElementi) {
        this.listaElementi=listaElementi;
    }

    public List<T> getListaElementi() {
        return listaElementi;
    }

    public void setListaElementi(List<T> listaElementi) {
        this.listaElementi = listaElementi;
    }

    public void addElemento(T elemento) {
        listaElementi.add(elemento);
    }

    public void removeElemento(T elemento) {
        listaElementi.remove(elemento);
    }
}
