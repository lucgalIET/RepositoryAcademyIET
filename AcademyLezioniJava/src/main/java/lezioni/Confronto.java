package main.java.lezioni;

import java.util.Scanner;

public class Confronto {

    public static void main(String[] args) {
        boolean v = true;

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        while (v) {
            String s = sc.nextLine();
            String s1 = sc.nextLine();

            System.out.println(s.equalsIgnoreCase(s1));
            sc.reset();
            sc1.reset();

        }

    }
}
