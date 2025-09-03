package exer04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] notas = new double[3];

        for (int i = 0; i < 3; i++) {
            double n = -1;
            while (n < 0 || n > 10) {
                n = sc.nextDouble();
            }
            notas[i] = n;
        }

        double media = (notas[0] + notas[1] + notas[2]) / 3;

        if (media >= 7) System.out.println("Aprovado");
        else if (media >= 5) System.out.println("Recuperacao");
        else System.out.println("Reprovado");
    }
}
