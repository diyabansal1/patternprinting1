public class pattern7 {

    public static void main(String[] args){
        int n=5;
        int row=1;
        int star=n;
        int space=n-2;
        while(row<=n) {
            if (row == 1 || row == n) {
                int i = 1;
                while (i <= star) {
                    System.out.print("*" + " ");
                    i++;
                }
            } else {
                //star
                System.out.print("*" + " ");

                //space
                int j = 1;
                while (j <= space) {
                    System.out.print("  ");
                    j++;
                }
                //star
                System.out.print("*" + " ");

            }
            row++;


            System.out.println();
        }

    }
}
