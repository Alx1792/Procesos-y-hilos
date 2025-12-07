package UF2;

import java.util.Scanner;

public class cFilPrincipal {

  public static void main (String [] pArguments) {
      Scanner scan =new Scanner(System.in);
      System.out.println("Quants fils vols crear");
      int fils= scan.nextInt();
      int primer=100;
      int afegir=100;
      System.out.println("Iniciant fil principal");

      for(int i=0;i<fils;i++){
          cFil vObjecteFil = new cFil ("#"+(i+1));//Sino quede feo
          vObjecteFil.sTemporitzacio(primer+(i*afegir)); //No se si aixi ho estic fent be
          Thread vFil=new Thread(vObjecteFil);
          vFil.start();
          System.out.println("Fil secundari iniciat "+ vObjecteFil.gNomFil());
      }





      try {
          for (int vComptador = 0; vComptador < 10; vComptador ++) {
            Thread.sleep (500);
            System.out.println ("Despertant aturada " + vComptador + " procès principal");
          }
      }
      catch (InterruptedException pExcepcio) {
          System.out.println("Interrompent execució procès principal");
      }
      System.out.println("Acabant execució procès principal");
  }

}
