public class Task5 {
    public static void main(String[] args) {
        int[][] a = {
                {1, 8, 10, 18},
                {20, 28, 30, 38},
                {68, 58, 40, 48}
        };

        int min = a[0][0];
        int max = a[0][0];

        for (int i = 0; i < a.length; i++) {
            System.out.print("{");

            for (int j = 0; j < a[i].length; j++) {
                if (j > 0) {
                    System.out.print(" ");
                }
                System.out.print(a[i][j]);
            }
            System.out.println("}");
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] < min) {
                    min = a[i][j];
                }

                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
        }

        System.out.println("Minimum = " + min);
        System.out.println("Maximum = " + max);
    }
}
