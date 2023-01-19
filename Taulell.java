import java.util.Random;

public class Taulell {

    static int[][] taulell(int caselles) {

        int [][]taulell = new int[caselles][caselles];

        for (int i = 0; i < caselles; i++) {
            for (int j = 0; j < caselles; j++) {
                taulell[i][j] = (int) (Math.random()*2);
                System.out.print("*  ");
                System.out.print("■  ");
                System.out.print(taulell[i][j]);
            }
            System.out.println();
        }
        return taulell;
    }
}

