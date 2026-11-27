import java.util.Arrays;

public class Question19AddMatrices {
    public static void main(String[] args) {
        int[][] first = {{1, 2}, {3, 4}};
        int[][] second = {{5, 6}, {7, 8}};
        long[][] sum = new long[first.length][first[0].length];

        for (int row = 0; row < first.length; row++) {
            for (int column = 0; column < first[row].length; column++) {
                // Add values at the same row and column.
                sum[row][column] = (long) first[row][column] + second[row][column];
            }
            System.out.println(Arrays.toString(sum[row]));
        }
    }
}