package main.java.lezioni.complessita;

public class EsClasse {
    public static void main(String[] args) {
        String string = "CiaoEccomi";
//        reverseStringRecursive(string);
//        reverseStringIterative(string);
        printStringRecursive(string);
    }

    public static void printNumbersRecursive(int n) {
        if (n <= 0)
            return;

        System.out.println(n);
        printNumbersRecursive(n - 1);
    }

    public static void reverseStringIterative(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }

    public static void reverseStringRecursive(String str) {
        if (str.isEmpty()) {
            return;
        }
        reverseStringRecursive(str.substring(1));
        System.out.print(str.charAt(0));
    }

    public static void printStringRecursive(String str) {
        if (str.isEmpty()) {
            return;
        }
        System.out.print(str.charAt(0));
        printStringRecursive(str.substring(1));
    }
}
