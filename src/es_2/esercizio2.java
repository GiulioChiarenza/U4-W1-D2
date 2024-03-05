package es_2;


import java.util.Scanner;

public class esercizio2 {
    public static void  main(String[] args){
        System.out.println("hello");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci un numero compreso tra 0 e 3: ");
        int num = scanner.nextInt();

        stampaNumeroInLettere(num);
        scanner.close();
    }
    public static void stampaNumeroInLettere(int num) {
        switch (num) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("Uno");
                break;
            case 2:
                System.out.println("Due");
                break;
            case 3:
                System.out.println("Tre");
                break;
            default:
                System.out.println("Errore: Il numero non è compreso tra 0 e 3.");
        }
    }
}