import java.util.Random;

public class Taulell {

    static int[][] taulell(int caselles) {

        int [][]taulell = new int[caselles][caselles];
        int num = 0, num1 = 0;

        int mines = (int) (Math.pow(caselles, 2) * 0.25);
        for (int k = 0; k < mines;k++){
            num = (int) (Math.random()*caselles);
            num1 = (int) (Math.random()*caselles);

            System.out.print(num);
            System.out.print(num1);
        }
        for (int i = 0; i < caselles; i++) {
            for (int j = 0; j < caselles; j++) {

                if(i == num && j == num1){
                    System.out.print("1");
                }else {
                    System.out.print("0");
                }
                taulell[i][j] = num;
                System.out.print("■  ");
                //System.out.print(taulell[i][j]);
            }
            System.out.println();
        }

        return taulell;
    }
}

