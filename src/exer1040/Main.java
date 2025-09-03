package exer1040;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String notasString = sc.nextLine();
        String[] notasStringSeparado = notasString.split(" ");
        double[] notas = new double[4];
        double soma = 0;


        for (int i = 0; i < notasStringSeparado.length; i++) {
            notas[i] = Double.parseDouble(notasStringSeparado[i]);
        }

        for (int i = 0; i < notasStringSeparado.length; i++) {
            if (i == 0) soma += notas[i] * 2;
            if (i == 1) soma += notas[i] * 3;
            if (i == 2) soma += notas[i] * 4;
            if (i == 3) soma += notas[i] * 1;
        }

        double media = soma / 10;
    }
}
