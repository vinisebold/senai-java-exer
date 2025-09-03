package exer3342;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0, preto, branca, casas;

        while (n < 2 || n > 100) {
            n = sc.nextInt();
        }

        if (n % 2 == 0) {
            casas = (n * n) / 2;
            System.out.println(casas + " casas brancas e " + casas + " casas pretas");
        } else {
            preto = ((n * n) / 2);
            branca = ((n * n) / 2) + 1;
            System.out.println(branca + " casas brancas e " + preto + " casas pretas");
        }
    }
}
