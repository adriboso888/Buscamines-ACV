import java.util.Random;

public class Taulell {

    static int[][] taulell(int caselles) {

        int[][] taulell = new int[caselles][caselles];


        int mines = (int) (Math.pow(caselles, 2) * 0.2);
        int x = 0, y = 0, num = 0, contador = 0;


        for (int i = 0; i < caselles; i++) {
            for (int j = 0; j < caselles; j++) {
                taulell[i][j] = 0;
            }
        }

        do {
            x = (int) (Math.random() * caselles);
            y = (int) (Math.random() * caselles);
            if (taulell[x][y] == 0) {
                taulell[x][y] = 1;
                contador++;
            }


        } while (contador != mines);



        return taulell;
    }

    public static void nombresCoordenades(int caselles){
        for(int i = 0; i<= caselles; i++ ){
            System.out.print(i + "  ");
        }
        System.out.println();
    }

    public static void mostrarTaulell(int caselles){
        for (int i = 0; i < caselles; i++) {
            System.out.print(i+1 + "  ");
            for (int j = 0; j < caselles; j++) {
                System.out.print("■  ");
            }
            System.out.println();
        }
    }
}