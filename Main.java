import java.util.InputMismatchException;
import java.util.Scanner;

public class
Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int caselles = 0;



        Menu.mostrarMenu();
        caselles = Integer.parseInt(sc.nextLine());

                Taulell.nombresCoordenades(caselles);
                Taulell.taulell(caselles);
                Coordenades.DemanarCoordenades(caselles, sc, Taulell.taulell(caselles));


            }
    }
