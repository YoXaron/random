import java.sql.SQLOutput;
import java.util.Scanner;
class SomeTests {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char[][] matrix = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = '.';

                if (i == n / 2) {
                    matrix[i][j] = '*';
                }
                if (j == n / 2) {
                    matrix[i][j] = '*';
                }
                if (i == j) {
                    matrix[i][j] = '*';
                }
                if (i + j == n - 1) {
                    matrix[i][j] = '*';
                }

                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
