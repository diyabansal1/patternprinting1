public class pattern10 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int space =0;
        int star =2*n-1;
        while (row <=n) {
            //space
            int j = 1;
            while (j <= space) {
                System.out.print("  ");
                j++;
            }
            //star
            int i = 1;
            while (i <= star) {
                System.out.print("*" + " ");
                i++;
            }

            row++;
            space++;
            star=star-2;
            System.out.println();
        }
    }
}
