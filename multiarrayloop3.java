public class multiarrayloop3 {
    public static void main(String[] args) {

        int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        for (int j=0; j <a.length; j++) {
            for (int i = a.length-1; i >=0; i--) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
