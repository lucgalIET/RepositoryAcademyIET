package lezioni.tipigenerici;

public class MainContatore {

    public static void main(String[] args) {

        Contatore<Integer> contatore = new Contatore<>();

        contatore.setIncrementa(13);
        contatore.setIncrementa(10);
        contatore.setIncrementa(11);
        contatore.setIncrementa(12);
        int i = contatore.getConteggio();
        int i1 = contatore.getUltimoValore();

        System.out.println("Contatore: " + i + ", Ultimo valore:  " + i1);


        Contatore<String> contatoreStringa = new Contatore<>();
        contatoreStringa.setIncrementa("Ciao");
        contatoreStringa.setIncrementa("Hello");
        contatoreStringa.setIncrementa("Hi");

        String s = contatoreStringa.getUltimoValore();
        int i4 = contatoreStringa.getConteggio();

        System.out.println(contatoreStringa.getUltimoValore() + "ContatoreStringa" +  " " + i4);
    }
}
