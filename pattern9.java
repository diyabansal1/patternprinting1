public class pattern9 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int space = n - 1;
        int star = 1;
        while (row <= n) {
            //space
            int j = 1;
            while (j <= space) {
                System.out.print(" ");
                j++;
            }
            //star
            int i = 1;
            while (i <= star) {
                if(i%2==0){
                    System.out.print("  ");
                }
                else {
                    System.out.print("*" + " ");
                }
                i++;
            }

            row++;
            space--;
            star=star+2;
            System.out.println();
        }
    }
}
