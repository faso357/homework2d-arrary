/*Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns.
 Develop a program which will identify/print the even numbers only.

 */


import java.util.Arrays;

public class task5 {

    public static void main(String[] args) {
        int[][] nums = {{1, 5, 4, 8}, {8, 6, 5, 3}, {6, 10, 3, 1}};

        for (int i = 0; i < nums.length; i++) {
            for (int k = 0; k < nums[i].length; k++) {
                if (nums[i][k] % 2 == 0) {
                    System.out.println(nums[i][k] + " ");
                }

            }

        }
    }
}







