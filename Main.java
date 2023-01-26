
import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int caselles = 0;
        boolean comprovacio;

        do {
            Menu.mostrarMenu();


            try {
                caselles = Integer.parseInt(sc.nextLine());
                Taulell.taulell(caselles);  
                Taulell.nombresCoordenades(caselles);
                Taulell.mostrarTaulell(caselles, Taulell.taulell(caselles), Coordenades.DemanarCoordenades());
                Coordenades.DemanarCoordenades(caselles, sc, Taulell.taulell(caselles));
                comprovacio = true;

            } catch (Exception ex) {
                System.out.println("El valor introduit no és valid");
                System.out.println();
                comprovacio = false;
            }

        }while (!comprovacio);

        Taulell.taulell(caselles);
        Taulell.nombresCoordenades(caselles);
        Taulell.mostrarTaulell(caselles, Taulell.taulell(caselles), Coordenades.DemanarCoordenades());


        Coordenades.DemanarCoordenades(caselles, sc, Taulell.taulell(caselles));
    }



}

