public class Taulell {
    public static int COLUMNES = 10;
    public static int FILES = 10;
    static void taulell() {

        for (int i = 0; i < COLUMNES; i++) {
            System.out.print("  ");
            for (int j = 0; j < FILES; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

}
