/*
 * Stella Castura
 * 4/27/2022
 * CubesAndSquaresAndPowers.java
 * calcualtes cubes and squares and powers
 */
package cubesandsquaresandpowers;
import java.util.Scanner;

/**
 *
 * @author stcas7054
 */
public class CubesAndSquaresAndPowers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int pow;
        int num;
        int ans = 1;
        int choice;
        
        do 
        {
            System.out.println("1… Find the value of a number squared (NOTE: 22 = 2 x 2)");
            System.out.println("2… Find the value of a number cubed (NOTE: 23 = 2 x 2 x 2)");
            System.out.println("3… Find the value of a number, to any power");
            System.out.println("4… Exit");
            choice = scan.nextInt();
            if (choice == 1)
            {
                System.out.println("squared");
            }
            else if (choice == 2)
            {
                System.out.println("cubed");
            }
            else if (choice == 3)
            {
                System.out.println("to any power");
            }
            else if (choice ==4)
            {
                System.out.println("goodbye");
            }
        }
        while (choice != 4);
    }
    
}
