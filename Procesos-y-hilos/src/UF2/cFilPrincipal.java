package UF2;

import java.util.Scanner;

public class cFilPrincipal {
    public static void main (String [] pArguments) throws InterruptedException {
        Scanner scan =new Scanner(System.in);
        System.out.println("Quants fils vols crear");
        boolean invalid = true;
        int fils = scan.nextInt();
        while (invalid) {
            if (fils > 50) {
                System.out.println("Massa fils, posa max 50 si no estarem tota la tarda");
                fils = scan.nextInt();
            }
            else {
                invalid = false;
            }
        }

        int temps = 100;
        System.out.println("Iniciant fil principal");

        for(int i=0;i<fils;i++){
            cFil vObjecteFil = new cFil ("#"+(i+1));//Sino quede feo
            vObjecteFil.sTemporitzacio(i*temps); //No se si aixi ho estic fent be
            Thread vFil=new Thread(vObjecteFil);
            vFil.start();
            System.out.println("Fil secundari iniciat "+ vObjecteFil.gNomFil());
        }

        try {
            for (int vComptador = 0; vComptador < 10; vComptador ++) {
                Thread.sleep(temps * fils + 1); // aixi sempre acabara despres (:
                System.out.println ("Despertant aturada " + vComptador + " procès principal");
            }
        }
        catch (InterruptedException pExcepcio) {
            System.out.println("Interrompent execució procès principal");
        }
        System.out.println("Acabant execució procès principal");
    }
}
