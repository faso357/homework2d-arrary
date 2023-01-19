/*
Create 2D array of cars : american, german, korean, italian.
Then retrieve all values from that array using 2 different loops

*/

import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {
        String[][] cars = {{"american", "german", "korean", "italian"}, {"Ford", "BMW", "Kia", "Mini"}};
        for (String[] matrix : cars) {
            System.out.println(Arrays.toString(matrix));
        }
        System.out.println("----------------------------------------------------------");

        for (int i = 0; i < cars[0].length; i++) {
            System.out.print(cars[0][i]+" ");
            System.out.println(cars[1][i]);

        }

    }
}





