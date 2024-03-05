package es_3;


import java.util.Scanner;

public class esercizio3 {
    public static void  main(String[] args){
        System.out.println("hello");

        System.out.println("hello");

        splitString();

    }
    public static void splitString() {
        Scanner scanner = new Scanner(System.in);

        String input = "";
        while (true) {
            System.out.print("Inserisci una stringa (digita ':q' per uscire): ");
            input = scanner.nextLine();

            if (input.equals(":q")) {
                System.out.println("Programma terminato.");
                break;
            }
            for (int i = 0; i < input.length(); i++) {
                System.out.print(input.charAt(i));
                System.out.print(", ");

            }
            System.out.println();
        }

        scanner.close();
    }
    }

