/*Create a 2D array or integer type and store numbers in 3 rows and 3 columns.
Print the sum of all numbers.
 */


import java.util.Arrays;

public class task4 {

    public static void main(String[] args) {
       int [] [] nums = {{1,2,3},{1,2,3},{1,2,3}};

       for(int[ ] sum :nums) {
           System.out.println(Arrays.toString(sum));
       }
           System.out.println("------------------------------------");
int sum =0 ;
           for (int i = 0; i < nums.length; i++) {
               for (int k = 0; k< nums[i].length; k++){
                   sum+= nums[i][k];
               }
           }
        System.out.println(sum);
        }
    }







