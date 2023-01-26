public class Taulell {

    static int[][] taulell(int caselles) {

        //Creacio de l'Array i declaració de les variables
        int[][] taulell = new int[caselles][caselles];
        int mines = (int) (Math.pow(caselles, 2) * 0.2);
        int x = 0, y = 0, contador = 0;

        //construir zones sense mines
        for (int i = 0; i < caselles; i++) {
            for (int j = 0; j < caselles; j++) {
                taulell[i][j] = 0;
            }
        }

        //Crearem mines a poscions aleatòries
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
     * Amb aixo podrem veure les coordenades de X i de Y per seleccionar les caselles.
     *
     * @param caselles
     */
    public static void nombresCoordenades(int caselles) {
        for (int i = 0; i <= caselles; i++) {
            System.out.print(i + "  ");
        }
        System.out.println();
    }

}