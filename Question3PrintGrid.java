public class Question3PrintGrid {
    public static void main(String[] args) {
        char[][] grid = new char[10][10];

        // The outer loop moves through the rows.
        for (int row = 0; row < grid.length; row++) {
            // The inner loop moves through the columns in this row.
            for (int column = 0; column < grid[row].length; column++) {
                grid[row][column] = '-';

                if (column > 0) {
                    System.out.print(" ");
                }
                System.out.print(grid[row][column]);
            }
            System.out.println(); // Start the next row.
        }
    }
}