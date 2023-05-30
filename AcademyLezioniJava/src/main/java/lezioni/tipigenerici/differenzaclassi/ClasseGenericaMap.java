package main.java.lezioni.tipigenerici.differenzaclassi;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClasseGenericaMap<K, V> {

    private Map<K, V> mappa = new HashMap<>();

    public ClasseGenericaMap() {
    }

    public ClasseGenericaMap(Map<K, V> mappa) {
        this.mappa = mappa;
    }

    public void aggiungiElemento(K chiave, V valore) {
        mappa.put(chiave, valore);
    }

    public V getValoreElemento(K chiave) {
        return mappa.get(chiave);
    }

    public boolean isPresent(K chiave) {
        return mappa.containsKey(chiave);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public void stampaMappa() {
//        K chiave;
//        V valore;
        for (Map.Entry<K, V> elem : mappa.entrySet()) {
            K chiave = elem.getKey();
            V valore = elem.getValue();
            System.out.println("Questa e' la chiave: " + chiave + ". " + " Questo e' il valore: " + valore + ", HashCode:  " + elem.hashCode());
        }
    }

//    public void stampaMappa() {
////        K chiave;
////        V valore;
//        for (K k : mappa.keySet()) {
//            K chiave = k;
//            V valore = mappa.get(k);
//            System.out.println("Questa e' la chiave: " + chiave + ". " + " Questo e' il valore: " + valore + ". ");
//        }
//    }

    //    public void stampaHashCodeList(List<?> lista) {
//        for (Object o : lista) {
//        int hashCode = o.hashCode();
//            System.out.println(hashCode);
//        }
//    }
    public void stampaHashCodeList() {
        for (Map.Entry<K, V> o : mappa.entrySet()) {
            int hashCode = o.hashCode();
            System.out.println("La chiave: " + o.getKey() + ", ha per HashCode: " + hashCode);
        }
    }

}
