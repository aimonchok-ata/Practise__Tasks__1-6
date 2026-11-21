public class Task3 {
    public static void main(String[] args) {
        int[][] a = {
                {8, 10, 18},
                {30, 16, 22},
                {28, 88, 40}
        };

        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            System.out.print("{");

            for (int j = 0; j < a[i].length; j++) {
                if (j > 0) {
                    System.out.print(" ");
                }

                System.out.print(a[i][j]);
                sum += a[i][j];
            }

            System.out.println("}");
        }

        System.out.println("Sum = " + sum);
    }
}
