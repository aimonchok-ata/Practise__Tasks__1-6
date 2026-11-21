import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] a = new int[2][3];

        System.out.println("Enter numbers for your matrix (2 x 3)");

        System.out.println("Enter first row (3 numbers):");
        a[0][0] = sc.nextInt();
        a[0][1] = sc.nextInt();
        a[0][2] = sc.nextInt();

        System.out.println("Enter second row (3 numbers):");
        a[1][0] = sc.nextInt();
        a[1][1] = sc.nextInt();
        a[1][2] = sc.nextInt();

        System.out.println("Your matrix:");

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

        sc.close();
    }
}
