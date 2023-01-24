import java.util.Scanner;

public class Coordenades {

    public static int DemanarCoordenades(int caselles, Scanner sc, int[][] taulell){
        System.out.println("Introdueix les coordenades (x i y): ");
        int xCoordenades = 0, yCoordenades = 0;
        boolean detectarMines = false;
        do{
            System.out.print("--> X: ");
            xCoordenades = sc.nextInt();
            System.out.print("--> Y: ");
            yCoordenades = sc.nextInt();
            if(taulell[xCoordenades-1][yCoordenades-1] == 1){
                System.out.println("☠");
                detectarMines = true;
            }else{
                System.out.println("\uD83C\uDD87");
            }

        return xCoordenades;
    }while(!detectarMines);
    }

    public static void actualitzarTaulell(){

    }


}
