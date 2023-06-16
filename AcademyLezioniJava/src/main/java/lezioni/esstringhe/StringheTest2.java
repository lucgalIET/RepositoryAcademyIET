package lezioni.esstringhe;

import java.io.IOException;
import java.util.Scanner;

public class StringheTest2 {

    public static void main (String args []) throws IOException {

//                InputWindow in = new InputWindow ();
//                OutputWindow out = new OutputWindow ("Finestra di output");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserire una stringa: ");
        String frase = scanner.nextLine();
        System.out.println("Numero di caratteri della stringa: " + frase.length());
        System.out.println("Estrazione sottostringa:inserire posizione di inizio (inclusa) :");
        int inizio = scanner.nextInt();
        System.out.println("Estrazione sottostringa:inserire posizione di fine (inclusa) :");
        int fine = scanner.nextInt();
        frase=frase.trim();
        System.out.println(frase.trim());
        System.out.println("Sottostringa estratta: " + frase.substring(inizio, fine));
//                out.setFont ("Arial", 16);
//                String s = in.readString ("Inserire una stringa");
//                out.writeln ("Numero di caratteri della stringa: " + s.length());
//                int inizio = in.readInt ("Estrazione sottostringa:
//                        inserire posizione di inizio (inclusa)");
//                int fine = in.readInt ("Estrazione sottostringa: inserire posizione
//                        di fine (esclusa)");
//                        out.writeln ("Sottostringa estratta: " + s.substring(inizio, fine));
            }

        }
