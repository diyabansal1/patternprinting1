public class pattern11 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int space = 0;
        int star = 1;
        while (row <= 2 * n - 1) {
            //star
            int j = 1;
            while (j <= star) {
                System.out.print("*" + " ");
                j++;
            }
            //next roww//mirror
            if (row < n) {
                star++;
            } else {
                star--;
            }
            row++;
            System.out.println();
        }
    }
}

