package context;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	//Scanner
        Scanner sc = new Scanner(System.in);

        int opcion = 0;

        while (opcion != 3) {

            System.out.println("\nMENU");
            System.out.println("1. Suma");
            System.out.println("2. Promedio");
            System.out.println("3. Salir");
            System.out.print("Elija una opción: ");

            opcion = sc.nextInt();

            //Ciclo
            if (opcion == 1) {

                int adicion = 0;
                int num = 1;

                while (num != 0) {
                    System.out.print(
                            "Ingrese un número entero "
                            + "(0 para salir): "
                    );
                    num = sc.nextInt();
                    adicion += num;
                }

                System.out.println("Resultado: " + adicion);

            } else if (opcion == 2) {

                int n = 10;
                int adicion = 0;

                for (int i = 1; i <= n; i++) {
                    System.out.print("Número " + i + ": ");
                    int num = sc.nextInt();
                    adicion += num;
                }

                double prom = (double) adicion / n;
                System.out.println("Promedio: " + prom);

            } else if (opcion == 3) {
                System.out.println("Salir");

            } else {
                System.out.println("¡ERROR!");
                System.out.println("Ingrese una opción válida");
            }
        }

        sc.close();
    }
}