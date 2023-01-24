import java.util.Random;

public class Taulell {

    static int[][] taulell(int caselles) {

        int[][] taulell = new int[caselles][caselles];
        int mines = (int) (Math.pow(caselles, 2) * 0.2);
        int x = 0, y = 0, num = 0, contador = 0;

       /* do{
            for (int i = 0; i < mines; i++){
                x = (int) (Math.random() * caselles);
                y = (int) (Math.random() * caselles);
                if (i == x && j == y) {
                    System.out.print("1");
                    num = 1;
                    contador++;
                } else {
                    num = 0;
                    System.out.print("0");
                }
            }
        }while(contador != mines);
*/
        for(int i = 0; i < caselles; i++){
            for(int j = 0;j < caselles; j++){
                taulell[i][j] = 0;
            }
        }

        for (int k = 0; k < mines;k++){
            x = (int) (Math.random()*caselles);
            y = (int) (Math.random()*caselles);

            taulell[x][y] = 1;
        }

        for(int i = 0; i<caselles;i++){
            for(int j = 0; j<caselles;j++){
                System.out.print(taulell[i][j]);
            }
        }
       /**




        System.out.print(mines);
        for (int i = 0; i < caselles; i++) {

            for (int j = 0; j < caselles; j++) {


                do{
                    x = (int) (Math.random() * caselles);
                    y = (int) (Math.random() * caselles);
                    if (i == x && j == y) {
                        System.out.print("1");
                        num = 1;
                        contadorMines++;
                    } else {
                        num = 0;
                        System.out.print("0");
                    }

                }while (mines == contadorMines);

                taulell[i][j]= num;

                System.out.print("■  ");
                System.out.print(taulell[i][j]);
            }
            System.out.println();

        }


        }*/

        return taulell;
    }
}

