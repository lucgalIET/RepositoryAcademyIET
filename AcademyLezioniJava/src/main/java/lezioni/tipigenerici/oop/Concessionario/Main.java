package lezioni.tipigenerici.oop.Concessionario;

public class Main {

    public static void main(String[] args) {
        Concessionario<AutomobileAbstract> concessionario = new Concessionario<AutomobileAbstract>();

        AutomobileDiesel fiesta = new AutomobileDiesel("Ford", "Fiesta", 2004);

        AutomobileElettrica tesla = new AutomobileElettrica("Tesla", "Model Y", 2020);

        fiesta.accelera();
        tesla.frena();
        fiesta.rifornimento();
        tesla.setBatteria(0);
        tesla.isFullOrEmpty();

        System.out.println(fiesta.getNumeroTelaio());
        System.out.println(tesla.getNumeroTelaio());

        concessionario.inserisciAutomobile(fiesta);
        concessionario.inserisciAutomobile(tesla);

        concessionario.rimuoviAutomobile(tesla);
        System.out.println(concessionario.cercaAutomobile("Model Y"));
        System.out.println(concessionario.cercaAutomobile("Fiesta"));

        System.out.println(concessionario.numeroAutomobili());

    }
}
