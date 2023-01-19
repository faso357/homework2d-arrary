/*3) Using 2D array create a grocery list.
Inside you should have an array of veggies, fruits, dairy and sweets.
Retrieve all values from that array using 2 different loops

*/

import java.util.Arrays;

public class task3 {

    public static void main(String[] args) {
        String[][] list = {
                {"tomato", "onion", "cucumber"},
                {"mango", "berry", "apple"},
                {"milk", "egg", "cheese"},
                {"cake", "muffin"}};
        for (String[] grocery : list) {
            System.out.println(Arrays.toString(grocery));
        }


        System.out.println("----------------------------------------------------------");

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++){
                System.out.print(list[i][j] + " ");
            }
            System.out.println();

        }
    }
}






