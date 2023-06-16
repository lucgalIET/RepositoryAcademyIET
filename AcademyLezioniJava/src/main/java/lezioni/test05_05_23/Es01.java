package lezioni.test05_05_23;

import java.util.StringTokenizer;

public class Es01 {

        public static void main(String[] args) {
            String frase = "Questa èeeeeeeeeeeeeeeeee una frase di esempio";
            String parolaPiuLunga = trovaParolaPiuLunga(frase);
            System.out.println(parolaPiuLunga);
        }

    public static String trovaParolaPiuLunga(String frase) {
        StringTokenizer tokenizer = new StringTokenizer(frase);
        String parolaPiuLunga = "";
        while (tokenizer.hasMoreTokens()) {
            String parola = tokenizer.nextToken();
            if (parola.length() > parolaPiuLunga.length()) {
                parolaPiuLunga = parola;
            }
        }
        return parolaPiuLunga;
    }
}
