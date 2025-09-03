package exer01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        String op = sc.next();

        switch (op) {
            case "+" -> System.out.println(a + b);
            case "-" -> System.out.println(a - b);
            case "*" -> System.out.println(a * b);
            case "/" -> {
                if (b == 0) System.out.println("Erro: divisao por zero");
                else System.out.println(a / b);
            }
            default -> System.out.println("Operacao invalida");
        }

        sc.close();
    }
}
