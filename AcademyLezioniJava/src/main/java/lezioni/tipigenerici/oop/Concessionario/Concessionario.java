package main.java.lezioni.tipigenerici.oop.Concessionario;

import java.util.ArrayList;
import java.util.List;


public class Concessionario<T extends AutomobileAbstract>{

    private List<T> listAutomobili = new ArrayList<>();

    public void inserisciAutomobile(T automobile){
        listAutomobili.add(automobile);
    }

    public void rimuoviAutomobile(T automobile){
        listAutomobili.remove(automobile);
    }

    public int numeroAutomobili(){
        return listAutomobili.size();
    }

    public T cercaAutomobile(String modello) {
        for (T elem : listAutomobili) {
            if(elem.getModello().equals(modello)) return elem;
        }
        return null;
    }
}
