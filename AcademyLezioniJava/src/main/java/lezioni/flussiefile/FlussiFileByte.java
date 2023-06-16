package lezioni.flussiefile;

import java.io.*;
//I flussi in Java possono essere di due tipi: flussi di byte (byte streams) e flussi di caratteri (character streams)
//Questi flussi leggono e scrivono dati come sequenze di byte
//flussi di byte (byte streams)
public class FlussiFileByte {

    public static void main(String[] args) {

        try {
            OutputStream outputStream = new FileOutputStream("src/main/java/lezioni/flussiefile/file/output.bin");
            outputStream.write(65);
            outputStream.write(67);
            outputStream.write(68);
            outputStream.write(69);
            outputStream.write(70);
            outputStream.close();

            InputStream inputStream = new FileInputStream("src/main/java/lezioni/flussiefile/file/output.bin");

//            System.out.println(inputStream.read());// 65
//            System.out.println(inputStream.read());// 67
//            System.out.println(inputStream.read());// -1 non c'e' piu' nulla

            int dati = inputStream.read();
            while (dati != -1) {
                //processando il dato letto
                System.out.println(dati);
                dati = inputStream.read();
            }
            inputStream.close();

        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
}
