package main.java.lezioni.test05_05_23;

public class Es03 {

    public static void main(String[] args) {
        String[] parole = {"Ciao", "Mondo", "questa", "è", "Una", "Frase"};
        int numParoleMaiuscole = contaParoleMaiuscole(parole);
        System.out.println(numParoleMaiuscole);
    }

    public static int contaParoleMaiuscole(String[] parole) {
        int numParoleMaiuscole = 0;
        for (int i = 0; i < parole.length; i++) {
            char primoCarattere = parole[i].charAt(0);
            if (Character.isUpperCase(primoCarattere)) {
                numParoleMaiuscole++;
            }
        }
        return numParoleMaiuscole;
    }
}