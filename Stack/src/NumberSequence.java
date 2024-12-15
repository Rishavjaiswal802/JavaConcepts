import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 class PyramidMaxPathSum {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Enter the number of rows in the pyramid:");
            int rows = Integer.parseInt(br.readLine());

            int[][] pyramid = new int[rows][];
            for (int i = 0; i < rows; i++) {
                System.out.println("Enter space-separated integers for row " + (i + 1) + ":");
                String[] rowValues = br.readLine().trim().split("\\s+");
                pyramid[i] = new int[rowValues.length];
                for (int j = 0; j < rowValues.length; j++) {
                    pyramid[i][j] = Integer.parseInt(rowValues[j]);
                }
            }

            int result = findMaxPathSum(pyramid);
            System.out.println("The highest sum obtained by traversing the pyramid is: " + result);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static int findMaxPathSum(int[][] pyramid) {
        int rows = pyramid.length;

        // Start from the second-to-last row and work our way up
        for (int i = rows - 2; i >= 0; i--) {
            for (int j = 0; j < pyramid[i].length; j++) {
                if (j < pyramid[i + 1].length && j + 1 < pyramid[i + 1].length) {
                    pyramid[i][j] += Math.max(pyramid[i + 1][j], pyramid[i + 1][j + 1]);
                }
            }
        }

        return pyramid[0][0];
    }
}
