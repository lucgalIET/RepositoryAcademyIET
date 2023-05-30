package main.java.lezioni.esstringhe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringheTest {

    public static void main (String args []) throws IOException {

        InputStreamReader input=new InputStreamReader(System.in);
        BufferedReader h= new BufferedReader(input);
        String st;
        System.out.print("vai:");
        st=h.readLine();
        System.out.println( elimina(st) );
    }//fine main
    static String elimina2(String s){
        s = s.replaceAll(" +"," " );
        return s;
    }

    static String elimina(String s){
        int i=0;
        StringBuffer sb=new StringBuffer();
        sb.append(s);
        do{
            if(sb.charAt(i)==' ' && sb.charAt(i+1)==' ')
                sb.deleteCharAt(i);
            else i++;
        }while(i < sb.length());
        s=sb.toString();
        return s;
    }//fine elimina
}
