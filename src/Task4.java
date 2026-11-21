public class Task4 {
    public static void main(String[] args) {
        int[][] a = {
                {11, 22, 33},
                {40, 50, 60},
                {77, 88, 99}
        };

        int even = 0;
        int odd = 0;

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
                if (a[i][j] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
        }

        System.out.println("Even = " + even);
        System.out.println("Odd = " + odd);
    }
}
