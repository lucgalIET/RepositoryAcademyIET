package main.java.lezioni.conditionalstatement;

public class ConditionalStatement {

//OPERATORI LOGICI
//    AND &&
//    OR ||
//    NOT !
//    EQUALS ==
//    NOT EQUALS !=

    public static void main(String[] args) {

        //if then else
//        boolean condizione=false;
//        boolean condizione2=false;
//        boolean condizione3=false;
//
//        if (condizione) { //true
//
//            //questo codice fa qualcosa
//
//        } else if (condizione2) {
//
//        } else if (condizione3){
//
//        }


        int num1 = 5;
        int num2 = 7;

        if (num1 > num2) { //se num1 e' maggiore di num2 entro nel 1o ramo

            //arriva qui se (num1 > num2) e' true
            System.out.println("E' maggiore!");

        } else {

            System.out.println("Non e' maggiore!");
        }

        if (num1 >= num2) { //se num1 e' maggiore o uguale di num2 entro nel 1o ramo

            //arriva qui se (num1 >= num2) e' true
            System.out.println("E' maggiore o uguale!");

        } else {

            System.out.println("E' minore!");
        }

//        ---------------------------------------------------------------------------


        boolean pluto = false;
        boolean isTrue = false;

        if (pluto) {    //se pluto = true

            System.out.println("E' vero!");

        } else if (!pluto) { //se pluto = false

            System.out.println("E' falso");
        }

//        ---------------------------------------------------------------------------

        if (num1 != num2) { //se num1 e' diverso da num2 entro nel 1o ramo

            System.out.println("Sono diversi");

        } else if (num1 > num2) {   //se num1 e' maggiore di num2 entro nel 2o ramo

            System.out.println(num1 + " e' maggiore");

        } else if (num2 > num1) { //se num2 e' maggiore di num1 entro nel 3o ramo

            System.out.println(num2 + " e' maggiore");
        }

//        ---------------------------------------------------------------------------

        if (num1 == 5 && num2 == 7) {

            System.out.println("Hai indovinato!");
        } else {

            System.out.println("Riprova, sarai piu' fortunato!");
        }


        if (num1 == 5 || num2 == 7) {

            System.out.println("Hai indovinato!");
        } else {

            System.out.println("Riprova, sarai piu' fortunato!");
        }


    }
}
