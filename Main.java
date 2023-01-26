import java.util.InputMismatchException;
import java.util.Scanner;

public class
Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int caselles = 0;
        boolean comprovacio;


        Menu.mostrarMenu();
        caselles = Integer.parseInt(sc.nextLine());
        do {
            try {
                Taulell.nombresCoordenades(caselles);
                Taulell.taulell(caselles);
                Coordenades.DemanarCoordenades(caselles, sc, Taulell.taulell(caselles));
                comprovacio = true;

            } catch (Exception ex) {
                System.out.println("El valor introduit no és valid");
                System.out.println();
                comprovacio = false;
            }
        }while (!comprovacio);
    }
}