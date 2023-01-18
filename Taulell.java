import java.util.Random;

public class Taulell {

    static int[][] taulell() {

        for (int i = 0; i < Dificultat.files; i++) {
            for (int j = 0; j < Dificultat.columnes; j++) {
                taulell[i][j] = (int) (Math.random()*2);
                System.out.print("■  ");
                System.out.print(taulell[i][j]);
            }
            System.out.println();
        }

        System.out.println("Hola");
        return taulell;
    }

}
