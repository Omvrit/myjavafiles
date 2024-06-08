public class ScoreAfterFlippingTheArray {
    public static void main(String[] args) {
        int[][] grid = {{0, 0, 1, 1}, {1, 0, 1, 0}, {1, 1, 0, 0}};
        int rows = grid.length;
        int columns = grid[0].length;
        for (int i = 0; i < rows; i++) {
            if (grid[i][0] == 0) {
                for (int j = 0; j < columns; j++) {
                    if (grid[i][j] == 0) {
                        grid[i][j] = 1;
                    } else {
                        grid[i][j] = 0;
                    }
                }
            }
        }

        for (int j = 1; j < columns; j++) {
            int zeros = 0;
            int ones = 0;
            for (int i = 0; i < rows; i++) {
                if (grid[i][j] == 0) {
                    zeros++;
                } else {
                    ones++;
                }

            }

            if (zeros > ones) {
                for (int i = 0; i < rows; i++) {
                    if (grid[i][j] == 0) {
                        grid[i][j] = 1;
                    } else {
                        grid[i][j] = 0;
                    }

                }
            }
        }

        ////converting binary to decimal

        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum = sum + (int) (grid[i][j] * Math.pow(2, columns - j-1));


            }

        }
        System.out.println(sum);

    }
}
