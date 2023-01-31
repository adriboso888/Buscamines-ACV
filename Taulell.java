import java.util.Random;

public class Taulell {
    /**
     * Mètode per crear el taulell i assignar les mines
     *
     * @param caselles Nombre de caselles que ha introduït l'usuari
     * @return Retorna l'array del taulell amb les mines
     */
    static int[][] taulell(int caselles, int mines) {

        //Creació de l'array i declarar variables
        int[][] taulell = new int[caselles][caselles];
        int x = 0, y = 0, contador = 0;


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
        } while (contador != mines); //Mentre el comptador no sigui igual a les mines anirem repetint l'acció
        return taulell;
    }

    /**
     * Mostra les coordenades de les caselles
     * Amb això es podran veure les coordenades de X i de Y per seleccionar les caselles.
     *
     * @param caselles Nombre de caselles que ha introduït l'usuari
     */
    public static void nombresCoordenades(int caselles) {
        for (int i = 0; i <= caselles; i++) {
            System.out.print(i + "  ");
        }
        System.out.println();
    }


}