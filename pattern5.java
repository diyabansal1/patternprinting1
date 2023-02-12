public class pattern5 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int star = n;
        int space = 0;
        while (row <= n) {

            //star
            int i = 1;
            while (i <= star) {
                System.out.print("*"+" ");
                i++;
            }
            //space
            int j = 1;
            while (j <= space) {
                System.out.print("  ");
                j++;
            }
            row++;
            star--;
            space++;
            System.out.println();

        }

    }
}
