import java.util.Scanner;

public class
Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int caselles = 0;

        Menu.mostrarMenu();
        caselles = sc.nextInt();

        Taulell.taulell(caselles);
        Taulell.nombresCoordenades(caselles);
        Taulell.mostrarTaulell(caselles, Taulell.taulell(caselles));

        Coordenades.DemanarCoordenades(caselles, sc, Taulell.taulell(caselles));

    }
}

