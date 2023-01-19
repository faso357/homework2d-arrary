/*Create 2D array of countries: north america countries, south america countries, europe countries,
 asian countries, african countries.
 Then print all values from that array using 2 different loops and calculate how many total countries been stored

 */


import java.util.Arrays;

public class task6 {

    public static void main(String[] args) {
        String[][] countries = {{"Usa", "Canada"}, {"Brazil", "Mexico"}, {"France", "England"},
                {"China", "Korea"}, {"Egypt", "South Africa"}};
        for (String[] sum : countries) {
            System.out.println(Arrays.toString(sum));}
        System.out.println("-----------------------------------------");
int count=0;
        for (int i = 0; i < countries.length; i++) {
            for (int k = 0; k < countries[i].length; k++) {
                System.out.print(countries[i][k]+" ");
                count++;
            }
            System.out.println();
        }
        System.out.println("--------");
        System.out.println(count);
    }
}








