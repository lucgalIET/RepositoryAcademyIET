package lezioni.flussiefile;

import java.io.*;

//utilizzo di flussi con il buffer
public class FlussiDiTesto {

    //BUFFER: si riferisce a una zona di memoria temporanea utilizzata per immagazzinare dati
    // in ingresso o in uscita durante il trasferimento tra due dispositivi o componenti di un sistema

    public static void main(String[] args) throws NostraEccezioneException {

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/main/java/lezioni/flussiefile/file/listaDellaSpesa.txt"));
            bufferedWriter.write("Panino");
            bufferedWriter.newLine();
            bufferedWriter.write("Pizza");
            bufferedWriter.newLine();
            bufferedWriter.write("Ci piace!");
            bufferedWriter.close();

            BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/java/lezioni/flussiefile/file/listaDellaSpesa2.txt"));
            String line = bufferedReader.readLine();

            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
            bufferedReader.close();
        } catch (IOException e) {
            throw new NostraEccezioneException("Hai mangiato tutto!");

        } finally {
            System.out.println("Il ristorante e' chiuso!");
        }
    }
}
