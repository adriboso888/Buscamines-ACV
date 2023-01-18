import java.util.Random;

public class Mines {

    public static int[][] posarMines(){
        for(int i = 0; i < Taulell.taulell().length; i++){
            for(int j = 0;j < Dificultat.mines; j++){
                Taulell.taulell()[i][j] = (int) (Math.random()*2);
            }

        }
        return Taulell.taulell();
    }



}
