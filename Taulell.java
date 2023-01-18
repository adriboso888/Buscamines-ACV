public class Taulell {

    static void taulell() {
        int [][]taulell = new int[Dificultat.files][Dificultat.columnes];

        for (int i = 0; i < Dificultat.files; i++) {
            for (int j = 0; j < Dificultat.columnes; j++) {
                taulell[i][j] = 0;
                System.out.print("*  ");
                System.out.print(taulell[i][j]);
            }
            System.out.println();
        }
    }

}
