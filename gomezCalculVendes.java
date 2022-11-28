//Aquest programa el que fa es comparar les sucursals i les vendes 

import java.util.Scanner;

public class gomezCalculVendes {
    public static void main(String[] args) {
        // Demanar número de sucursals i l'usuari les indica
        System.out.println("Quantes sucursals hi ha? ");
        Scanner scSucursals = new Scanner(System.in);
        int sucursals = scSucursals.nextInt();

        // Variable import total
        int impMax = 0;

        // Variable nom de la sucursal
        String nom = "";
        // L'import de compra que es sumarà a la següent compra
        int imp = 1;
        // Import total de una tenda
        int impUsu = 0;
        // Mentre hi hagui una sucursal
        while (sucursals > 0) {

            // Demanarà el nom de la sucursal i la guardarà a nomS
            System.out.println("Nom sucursal? ");
            String nomS = scSucursals.nextLine();
            nomS = scSucursals.nextLine();

            // Donem el valor de imp i impUsu als valors originals
            imp = 1;
            impUsu = 0;

            // Restem una sucursal al total de sucursals introduides per l'usuari
            sucursals--;

            // Mentre imp no sigui 0
            while (imp != 0) {

                // Ens demanarà l'import de la tenda i el guardarà a impUsu que es la suma dels
                // imp
                System.out.println("Quin és l'import de la tenda? ");
                imp = scSucursals.nextInt();

                // Diem que l'import total (impUsu amb valor original de 0) es sume amb imp
                impUsu = impUsu + imp;

                // Mostrem el resultat de la suma
                System.out.println(impUsu);

                // Si l'import total de la tenda és l'import més gran fins el moment
                // el guardem a impMax
                if (impUsu > impMax) {
                    nom = nomS;
                    impMax = impUsu;

                }
            }
        }
        // Mostrem el nom de la sucursal amb l'import total més gran
        System.out.println();

    }

}
