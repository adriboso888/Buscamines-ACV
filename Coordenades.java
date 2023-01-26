import java.util.Scanner;

public class Coordenades {

    public static String[][] DemanarCoordenades(int caselles, Scanner sc, int[][] taulell) {
        System.out.println("Introdueix les coordenades (x i y): ");
        String[][] coord = new String[caselles][caselles];
        int xCoordenades = 0, yCoordenades = 0;
        boolean detectarMines = false;


        for (int i = 0; i < caselles; i++) {
            for (int j = 0; j < caselles; j++) {
                coord[i][j] = "■  ";

            }
        }

        for (int i = 0; i < caselles; i++) {
            for (int j = 0; j < caselles; j++) {
                System.out.print(coord[i][j]);
                System.out.print(taulell[i][j]);
            }
            System.out.println();
        }


        do {
            System.out.print("--> X: ");
            xCoordenades = Integer.parseInt(sc.nextLine());
            System.out.print("--> Y: ");
            yCoordenades = Integer.parseInt(sc.nextLine());


            if(xCoordenades <= caselles && yCoordenades <= caselles)  //fem la comprobació per veure que les dades estan dins del taulell



            if (taulell[xCoordenades - 1][yCoordenades - 1] == 1) {
                coord[xCoordenades - 1][yCoordenades - 1] = "☠  ";
                for (int i = 0; i < caselles; i++) {
                    for (int j = 0; j < caselles; j++) {
                        System.out.print(coord[i][j]);
                    }
                    System.out.println();
                }
                detectarMines = true;

            } else {
                coord[xCoordenades - 1][yCoordenades - 1] = "\uD83C\uDD87  ";
                for (int i = 0; i < caselles; i++) {
                    for (int j = 0; j < caselles; j++) {
                        System.out.print(coord[i][j]);
                    }
                    System.out.println();
                }
            }
            proximitatMines(caselles, taulell, xCoordenades, yCoordenades );
        } while (!detectarMines);

        return coord;

    }


    public static void proximitatMines(int caselles, int[][] taulell, int xCoordenades, int yCoordenades ){
        for(int i = 0;i < 1;i++){

            for(int j = 0; j< 1;j++){
                if(taulell[xCoordenades + 1][yCoordenades] == 1){
                    System.out.println("Tens una o varies mines al voltant");
                } else if (taulell[xCoordenades][yCoordenades + 1] == 1) {
                    System.out.println("Tens una o varies mines al voltant");
                } else if (taulell[xCoordenades -1 ][yCoordenades] == 1) {
                    System.out.println("Tens una o varies mines al voltant");
                } else if (taulell[xCoordenades][yCoordenades - 1] == 1) {
                    System.out.println("Tens una o varies mines al voltant");

                } else if (taulell[xCoordenades + 1][yCoordenades + 1] == 1) {
                    System.out.println("Tens una o varies mines al voltant");
                } else if (taulell[xCoordenades + 1][yCoordenades - 1] == 1) {
                    System.out.println("Tens una o varies mines al voltant");
                } else if (taulell[xCoordenades - 1][yCoordenades + 1] == 1) {
                    System.out.println("Tens una o varies mines al voltant");
                } else if (taulell[xCoordenades - 1][yCoordenades - 1] == 1) {
                    System.out.println("Tens una o varies mines al voltant");
                }else{
                    System.out.println("No tens mines al voltant");
                }
            }
        }
    }
}