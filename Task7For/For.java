
/**
 * Write a description of class For here.
 *
 * @author Aurangzaib Danial Liaqat Khan
 * @version 03/03/2021
 */

import java.util.Scanner;

public class For
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] anArrayOfIntegers = new int[10]; 


        for (int counter = 0; counter < 10; counter++) {

            System.out.println("Please enter a whole number.");

            while (!scanner.hasNextInt()) {
                System.err.println("Error! You must enter a whole integer.");
                scanner.next();
            }
            anArrayOfIntegers[counter] = scanner.nextInt();
        }

        for (int counter = 0; counter < anArrayOfIntegers.length; counter++) {
            System.out.println(anArrayOfIntegers[counter]);
        }
    }
}
