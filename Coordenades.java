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
            if(taulell[xCoordenades][yCoordenades] == 1){
                System.out.println("Has Perdut");
                detectarMines = true;
            }else{
                System.out.println("\uD83C\uDD87");
            }

<<<<<<< HEAD
        System.out.print("--> X: ");
        xCoordenades = sc.nextInt();
        System.out.print("--> Y: ");
        yCoordenades = sc.nextInt();

        if (){
=======
        }while(!detectarMines);
>>>>>>> c8416460dc34daaf2e4e802c0d31f5b82c9624aa

        }
        return xCoordenades;
    }

    public static void actualitzarTaulell(){

    }


}
