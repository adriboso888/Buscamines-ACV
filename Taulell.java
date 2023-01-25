import java.util.Random;

public class Taulell {

    static int[][] taulell(int caselles) {

        int[][] taulell = new int[caselles][caselles];


        int mines = (int) (Math.pow(caselles, 2) * 0.2);
        int x = 0, y = 0, num = 0, contador = 0;


        //construir zones sense mines
        for (int i = 0; i < caselles; i++) {
            for (int j = 0; j < caselles; j++) {
                taulell[i][j] = 0;
            }
        }

        //crearem mines a poscions aleatories
        do {
            x = (int) (Math.random() * caselles); //generar aleatoriament posicio X de la bomba
            y = (int) (Math.random() * caselles); //generar aleatoriament posicio Y de la bomba
            if (taulell[x][y] == 0) { //si la posicio x i y es 0 li introduirem una mina i sumarem +1 al contador
                taulell[x][y] = 1;
                contador++;
            }
        } while (contador != mines); //mentres el contador no sigui igual a les mines anirem repetint l'acció

        return taulell;
    }

    /**
     * Mostra les cordenades de les caselles
     * Amb aixo podrem veure les cordenades de X i de Y per seleccionar les caselles
     *
     * @param caselles
     */
    public static void nombresCoordenades(int caselles) {
        for (int i = 0; i <= caselles; i++) {
            System.out.print(i + "  ");
        }
        System.out.println();
    }

    /**
     * Mostra el taulell
     *
     * @param caselles pasem per parametre les caselles per tal de saber quantes s'han de crear.
     */
    public static void mostrarTaulell(int caselles, int[][] taulell) {
        for (int i = 0; i < caselles; i++) {
            System.out.print(i + 1 + "  ");
            for (int j = 0; j < caselles; j++) {
                System.out.print("■  ");
                //System.out.print(taulell[i][j]);
            }
            System.out.println();
        }
    }
}