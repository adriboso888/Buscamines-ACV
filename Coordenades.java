import java.util.Scanner;

public class Coordenades {
    /**
     * Mètode per demanar les coordenades als usuaris
     *
     * @param caselles      Nombre de casselles que ha introduït l'usuari
     * @param sc            Escàner per demanar les coordenades
     * @param taulell       Array amb les posicions del taulell i les mines
     * @param detectarMines Boleà per saber si hi ha mines o no
     * @param valorValid    Comprovar que els valors són vàlids
     * @return retorna l'array amb les coordenades actualitzades de l'usuari
     */
    public static String[][] DemanarCoordenades(int caselles, Scanner sc, int[][] taulell, boolean detectarMines, boolean valorValid, int mines) {
        //Creació de l'array de coordenades i declarar variables
        String[][] coord = new String[caselles][caselles];
        int xCoordenades = 0, yCoordenades = 0;
        int contador = (int) (Math.pow(caselles, 2) - mines);
        //Crear la taula de quadrats blancs
        for (int i = 0; i < caselles; i++) {
            for (int j = 0; j < caselles; j++) {
                coord[i][j] = "■  ";
            }
        }

        TaulaQuadratsBlancs(caselles, coord);

        do {
            System.out.println("Introdueix les coordenades (x i y): ");
            System.out.print("--> X: ");
            yCoordenades = Integer.parseInt(sc.nextLine());
            System.out.print("--> Y: ");
            xCoordenades = Integer.parseInt(sc.nextLine());

            Taulell.nombresCoordenades(caselles);
            if (taulell[xCoordenades - 1][yCoordenades - 1] == 1) {
                coord[xCoordenades - 1][yCoordenades - 1] = "☠  ";
                TaulaQuadratsBlancs(caselles, coord);
                detectarMines = true;
            } else {
                coord[xCoordenades - 1][yCoordenades - 1] = "\uD83C\uDD87  ";
                TaulaQuadratsBlancs(caselles, coord);
            }
            contador--;
            System.out.printf("Queden %d casselles\n", contador);

        } while (!detectarMines && contador != 0);
        return coord;
    }

    /**
     * Aquest mètode mostrarà el taulell per pantalla
     *
     * @param caselles Nombre de caselles que ha introduit l'usuari
     * @param coord    Quadrats blancs del taulell
     */
    private static void TaulaQuadratsBlancs(int caselles, String[][] coord) {
        for (int i = 0; i < caselles; i++) {
            System.out.print(i + 1 + "  ");
            for (int j = 0; j < caselles; j++) {
                System.out.print(coord[i][j]);
            }
            System.out.println();
        }
    }
}