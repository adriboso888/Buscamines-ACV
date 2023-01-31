import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Main {

    public static void main(String[] args) {

        //Iniciar escàner i declarar variables
        Scanner sc = new Scanner(System.in);
        int caselles = 0;
        int mines = 0;
        boolean detectarMines = false, valorValid = false;


        Menu.mostrarMenu();
        //Comprovacio del valor introduit per l'usuari
        do {
            try {
                caselles = Integer.parseInt(sc.nextLine());
                valorValid = true;
            } catch (Exception e) {
                System.out.println("Introdueix un valor vàlid");
                valorValid = false;
            }
        } while (!valorValid);
        mines = (int) (Math.pow(caselles, 2) * 0.2);
        Taulell.nombresCoordenades(caselles);
        Taulell.taulell(caselles, mines);
        Coordenades.DemanarCoordenades(caselles, sc, Taulell.taulell(caselles, mines), detectarMines, valorValid, mines);

        if (!detectarMines) {
            Derrota.mostrarDerrota();
        } else {
            Victoria.mostrarVictoria();
        }
    }
}
