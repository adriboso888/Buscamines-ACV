import java.util.Scanner;

public class Dificultat {

    public static int COLUMNES = 0;
    public static int FILES = 0;

        static void dificultat(){
            Scanner lector = new Scanner(System.in);
            String dificultat;

            System.out.print("En quina dificultat vols jugar?\n" +
                    "1- Facil(10x10)\n2- Mitjà(15x15)\n3- Expert(20x20)\n");
            dificultat = lector.nextLine();

            switch (dificultat){

                case "Facil":{
                    System.out.println("S'ha introduit la dificultat facil");
                    COLUMNES = 10;
                    FILES = 10;
                    Taulell.taulell();
                    break;
                }
                case "Mitja":{
                    System.out.println("S'ha introduit la dificultat mitja");
                    COLUMNES = 15;
                    FILES = 15;
                    Taulell.taulell();
                    break;
                }
                case "Expert":{
                    System.out.println("S'ha introduit la dificultat experta");
                    COLUMNES = 20;
                    FILES = 20;
                    Taulell.taulell();
                    break;
                }

            }
        }
}


