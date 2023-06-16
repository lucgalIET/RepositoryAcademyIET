package lezioni.flussiefile;

import java.io.*;

//Questi flussi leggono e scrivono dati come sequenze di caratteri
//Flussi di caratteri (character streams)
public class FlussiDiChar {

    public static void main(String[] args) throws NostraEccezioneException {

        try {
            Writer writer = new FileWriter("src/main/java/lezioni/flussiefile/file/output.txt");
            writer.write("Hello world!");
            writer.close();

            Reader reader = new FileReader("src/main/java/lezioni/flussiefile/file/output2.txt");
            int dati = reader.read();
            while (dati != -1) {
//            System.out.println(Character.getName(dati)); LOL
                System.out.print((char) dati);
                dati = reader.read();
            }
            reader.close();

        } catch (IOException e) {
//            throw new RuntimeException();
            throw new NostraEccezioneException("Attezione: file non trovato!");
        }
    }
}
