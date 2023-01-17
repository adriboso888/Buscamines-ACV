public class Taulell {

    static void taulell() {

        for (int i = 0; i < Dificultat.COLUMNES; i++) {
            System.out.print("  ");
            for (int j = 0; j < Dificultat.FILES; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

}
