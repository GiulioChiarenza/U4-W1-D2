package es_1;



public class esercizio1 {
    public static void  main(String[] args){
        System.out.println("hello");
        System.out.println(stringaPariDispari("giulio"));
        System.out.println(stringaPariDispari("chiarenza"));

        System.out.println(annoBisestile(2024));
        System.out.println(annoBisestile(2021));
        System.out.println(annoBisestile(1900));
        System.out.println(annoBisestile(2000));

    }
    public static boolean stringaPariDispari(String string) {
        int lunghezza = string.length();

        if (lunghezza % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean annoBisestile(int year) {

        if ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

}