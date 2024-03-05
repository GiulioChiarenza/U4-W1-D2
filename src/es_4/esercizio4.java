package es_4;


import java.util.Scanner;

public class esercizio4 {
    public static void  main(String[] args){
        System.out.println("hello");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero intero: ");
        int num = scanner.nextInt();

        printCountdown(num);

        scanner.close();
    }
    public static void printCountdown(int num) {
        System.out.println("Conto alla rovescia:");
        for (int i = num; i >= 0; i--) {
            System.out.println(i);
        }
    }
}