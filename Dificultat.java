import java.util.Scanner;

public class Dificultat {

    static int files = 0;
    static int columnes = 0;
    static int mines = 0;

        static void dificultat(){
            Scanner lector = new Scanner(System.in);
            int dificultat;

            System.out.print("En quina dificultat vols jugar?\n" +
                    "1- Facil(10x10)\n2- Mitjà(15x15)\n3- Expert(20x20)\n");
            dificultat = lector.nextInt();

            switch (dificultat){

                case 1:{
                    System.out.println("S'ha introduit la dificultat facil");
                    files = 10;
                    columnes = 10;
                    mines = 15;
                    Taulell.taulell();
                    break;
                }
                case 2:{
                    System.out.println("S'ha introduit la dificultat mitja");
                    columnes = 15;
                    files = 15;
                    mines = 25;
                    Taulell.taulell();

                    break;
                }
                case 3:{
                    System.out.println("S'ha introduit la dificultat experta");
                    columnes = 20;
                    files = 20;
                    mines = 40;
                    Taulell.taulell();

                    break;
                }

            }
        }
}


