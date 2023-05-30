package main.java.lezioni.essetmap;

import java.util.*;

public class EsercizioSetMap {

    List<String> listaNomi = new ArrayList<>();

    Set<String> setNomi = new HashSet<>();
    Set<String> treeSetNomi = new TreeSet<>();

    Map<Integer, String> mappaNomiID = new HashMap<>();
    Map<Integer, String> mappaTreeNomiID = new TreeMap<>();

    public void resetLista(){
        listaNomi = new LinkedList<>();
    }

    public void faiqualcosa(){
        int i = 0;
        while(i<10){
            listaNomi.add("pippo");
            listaNomi.remove("pippo");
            i++;
        }
    }

    public void faiQualcosAltro(){

        for(int i=0;i<10;i++){
            listaNomi.add("str"+i);
        }

        for(String st:listaNomi){
            if(st.equalsIgnoreCase("str3"))
                listaNomi.remove("str3");
        }
        System.out.println(listaNomi);
    }

    public void removeConIterator(){

        for(int i=0;i<10;i++){
            listaNomi.add("str"+i);
            System.out.print(listaNomi.get(i)+" ");
        }

        System.out.println("");

        Iterator<String> it = listaNomi.iterator();
        while(it.hasNext()){
            if(it.next().equalsIgnoreCase("str3")){
                it.remove();
            }
        }

    }

    public void addSet() {
        for (int i = 0; i < 10; i++) {
            setNomi.add("str");
        }
    }

    public void addTreeSet(){
        this.treeSetNomi.add("mario");
        this.treeSetNomi.add("anna");
        this.treeSetNomi.add("anna");
        this.treeSetNomi.add("giuseppe");
        this.treeSetNomi.add("barbara");
    }

    public void metodoMappa(){
        this.mappaNomiID.put(100, "Giovanni");
        this.mappaNomiID.put(100, "Marco");
        this.mappaNomiID.put(200, "Giovanni");
        this.mappaNomiID.get(100);
        this.mappaNomiID.get(200);
        this.mappaNomiID.remove(100);
        Set<Integer> setChiavi = this.mappaNomiID.keySet();
        ArrayList<String> listaNomi = (ArrayList<String>) this.mappaNomiID.values();

        for (String s : mappaNomiID.values()) {

        }

        for(Integer i : mappaNomiID.keySet()){

        }

        for(Map.Entry<Integer, String> e : mappaNomiID.entrySet()){

        }
    }

    public static void main(String[] args) {
        EsercizioSetMap es = new EsercizioSetMap();
        //es.faiqualcosa();
        //es.faiQualcosAltro();

        //es.removeConIterator();

        es.addSet();
        es.addTreeSet();
        for (String s:es.treeSetNomi) {
            System.out.print(s + " ");
        }
    }

}
