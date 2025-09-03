package exer03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n <= 0) return;

        for (int i = n; i >= 0; i--) {
            System.out.println("Faltam " + i + " segundos");
            Thread.sleep(1000);
        }
    }
}
