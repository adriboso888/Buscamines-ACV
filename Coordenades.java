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

        do {
            System.out.print("--> X: ");
            xCoordenades = sc.nextInt();
            System.out.print("--> Y: ");
            yCoordenades = sc.nextInt();


            if(xCoordenades < caselles && yCoordenades < caselles)  //fem la comprobació per veure que les dades estan dins del taulell

                if (taulell[xCoordenades - 1][yCoordenades - 1] == 1) {
                    System.out.println("☠");
                    detectarMines = true;
                } else {
                    System.out.println("\uD83C\uDD87");
                }


                System.out.flush();
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
    } while (!detectarMines);

        return coord;

}}
