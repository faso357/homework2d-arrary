/*
1) Create a 2D array(shorter way) in which first array will consist of 4 names and second array will contain grades.
 Then your program should print name of the students that has A and B grade

*/

import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {

        String[][] matrix = {{"Nabil", "Mark", "Jason", "John"}, {"A", "B", "A", "B"}};
        for (String[] strings : matrix) {
            System.out.println(Arrays.toString(strings));
        }
        System.out.println("-------------------------------------------------");
        String[][] students = {{"Nabil", "Mark", "Jason", "John"}, {"A", "B", "A", "B"}};

        for (int i = 0; i < matrix[0].length; i++) {
            System.out.print(matrix[0][i]+" ");};
        System.out.println();
            for (int k = 0; k < matrix[1].length; k++) {
                System.out.print(matrix[1][k]+" ");
            }


        }
    }




