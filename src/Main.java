public class Main {
    public static void main(String[] args) {

        // ********************************************************* CONDIZIONALI ***********************************************
/*		int x = 20, y = 30, z = 40;

		if (!(x > y)) System.out.println("X è minore di Y");
		else System.out.println("X è maggiore di Y");

		if (x > y) System.out.println("X è maggiore di Y");
		else if (x == 100) System.out.println("X è uguale a 100");
		else System.out.println("X è minore di Y e non è uguale a 100");

		String r = x > y ? "X è maggiore di Y" : "X è minore di Y";

		System.out.println(r);

		int w = x > y ? (x > z ? x : z) : (y > z ? y : z);
		// Non abusare del ternary operator in quanto potrebbe compromettere la leggibilità del codice
		System.out.println(w);*/

        // ******************************************************** SWITCH CASE **************************************************

/*		String favouriteDish = "Pesce";

		switch (favouriteDish) {
			case "Pasta": {
				System.out.println("Il piatto preferito è la pasta!");
				break;

			}
			case "Pizza": {
				System.out.println("Il piatto preferito è la pizza!");
				break;
			}
			case "Minestra": {
				System.out.println("Il piatto preferito è la minestra!");
				break;
			}
			default: {
				System.out.println("Il piatto preferito non è nessuno dei precedenti!");
				break;
			}
		}*/

/*		Scanner scanner = new Scanner(System.in);

		System.out.println("Dammi X");
		int x = scanner.nextInt();

		System.out.println("Dammi Y");
		int y = scanner.nextInt();

		int z = x > y ? 100 : 1000;

		switch (z) {
			case 10: {
				System.out.println("z è 10");
				x++;
				break;
			}
			case 100: {
				System.out.println("z è 100");
				break;
			}
			case 1000: {
				System.out.println("z è 1000");
				x--;
				break;
			}
			default: {
				System.out.println("Nessuno dei precedenti");
				x++;
				break;
			}
		}

		System.out.println("X è uguale a: " + x);


		scanner.close();*/

        // ******************************************************** LOOPS **************************************************
/*		Scanner scanner = new Scanner(System.in);

		System.out.println("Dammi X");
		int x = scanner.nextInt();  // 20*/

/*		System.out.println("Dammi Y"); // 4
		int y = scanner.nextInt();

		while (y <= x + 10) {
			y += 4;
			System.out.println(y); // 32
		}*/

/*
		do {
			System.out.println(x = x + 1);
		} while (x < 10);
*/

/*		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) continue; // col continue salto l'iterazione corrente e passo alla prossima
			System.out.println(i);
		}*/

		/*for (int i = 0; i <= 10; i++) {
			if (i == 5) break; // col break usciamo dal loop
			System.out.println(i);
		}*/

        est:
        // etichetta il loop esterno per far si che sia possibile utilizzare break/continue da un loop interno ed uscire del tutto
        for (int i = 0; i < 5; i++) {
            if (i == 3) break;
            for (int j = 0; j < 5; j++) {
                if (j == 2) break est;
                System.out.println("j --> " + j);
            }
            System.out.println("i --> " + i);
        }
    }
}