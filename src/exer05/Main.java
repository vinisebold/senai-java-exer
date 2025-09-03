package exer05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine().toLowerCase();

        int vogais = 0, consoantes = 0;
        for (char c : frase.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if ("aeiou".indexOf(c) >= 0) vogais++;
                else consoantes++;
            }
        }

        System.out.println("Vogais: " + vogais);
        System.out.println("Consoantes: " + consoantes);
    }
}
