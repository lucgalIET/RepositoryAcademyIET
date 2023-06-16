package lezioni.conditionalstatement;

import java.util.Scanner;

public class ConditionalStatement3 {

//OPERATORI LOGICI
//    AND &&
//    OR ||
//    NOT !
//    EQUALS ==
//    NOT EQUALS ==

    public static void main(String[] args) {

        char valore1 = 'a';
        char valore2 = 'b';
        int espessione = 1;
        //switch-case

        switch (espessione) { //espressione e' un int

            case 1: //se espressione e' 1 entro in questo case
            //istruzione inizio
                System.out.println("Eccomi, sono il caso espessione=1");
            //istruzione fine
                break;

            case 2: //se il valore di espressione e' 2 entro in questo case
            //fai qualcosa
                break;

            case 77: //se il valore di espressione e' 77 entro in questo case
            //fai qualcosa
                break;

            default:    //se il valore di espressione non entra in nessun case, applichera' quello di default se presente
            //fai qualcosa
                break;
        }


        Scanner scanner = new Scanner(System.in);
        char lettera = scanner.next().charAt(0);
        switchami(lettera);
        scanner.close();
    }
        public static void switchami(char lettera) {

        switch (lettera) {

            case 'a': //if(lettera == 1)
                System.out.println("Eccomi sono " + lettera);
                break;
            case 'b': //if(lettera == 2)
                System.out.println("Eccomi sono " + lettera + " il piu' bello!");
                break;
            default: //if(lettera != 'a' && lettera != 'b')
                System.out.println("Eccomi qui sono il caso di default!");
        }
    }

    }
