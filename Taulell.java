import java.util.Random;

public class Taulell {

    static int[][] taulell(int caselles) {

        int[][] taulell = new int[caselles][caselles];
<<<<<<< HEAD
        int mines = (int) (Math.pow(caselles, 2) * 0.2) + 1;
=======
        int mines = (int) (Math.pow(caselles, 2) * 0.2) ;
>>>>>>> 56d793376d740bfc0ff7ed130102c67d8ad34b1a
        int x = 0, y = 0, num = 0, contador = 0;


        for (int i = 0; i < caselles; i++) {
            for (int j = 0; j < caselles; j++) {
                taulell[i][j] = 0;
            }
        }
<<<<<<< HEAD

            for (int k = 0; k < mines; k++) {
                x = (int) (Math.random() * caselles);
                y = (int) (Math.random() * caselles);

                taulell[x][y] = 1;
            }
=======
        do{
            x = (int) (Math.random()*caselles);
            y = (int) (Math.random()*caselles);
            if(taulell[x][y] == 0){
                taulell[x][y] = 1;
                contador++;
            }


        }while(contador != mines);

>>>>>>> 56d793376d740bfc0ff7ed130102c67d8ad34b1a


        for (int i = 0; i < caselles; i++) {
            for (int j = 0; j < caselles; j++) {
                System.out.print("■  ");
                System.out.print(taulell[i][j]);
            }
            System.out.println();
        }


        return taulell;
    }
}