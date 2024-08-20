public class multiarrayloop4 {
    public static void main(String[] args) {

        int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        for (int j = a.length-1;j>=0; j--) {
            for (int i=0;i<a.length;i++) {
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
