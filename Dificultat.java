import java.util.Scanner;

public class Dificultat {

    int

        static void dificultat(){
            Scanner lector = new Scanner(System.in);
            String dificultat;

            System.out.print("En quina dificultat vols jugar?\n" +
                    "1- Facil(10x10)\n2- Mitjà(15x15)\n3- Expert(20x20)\n");
            dificultat = lector.nextLine();

            switch (dificultat){

                case "Facil":{
                    System.out.println("S'ha introduit la dificultat facil");

                    Taulell.taulell();
                    break;
                }
                case "Mitja":{
                    System.out.println("S'ha introduit la dificultat mitja");

                    break;
                }
                case "Expert":{
                    System.out.println("S'ha introduit la dificultat experta");
                   
                    break;
                }
            }
        }
}


