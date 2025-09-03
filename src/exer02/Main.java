package exer02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade = -1;

        while (idade <= 0) {
            idade = sc.nextInt();
        }
        if (idade < 18) System.out.println("Acesso negado");
        else System.out.println("Acesso permitido");
    }
}