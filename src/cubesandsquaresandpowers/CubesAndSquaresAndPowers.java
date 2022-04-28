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
        //int ans = 1;
        int ans;
        int choice;
        
        do 
        {
            System.out.println("1… Find the value of a number squared (NOTE: 22 = 2 x 2)");
            System.out.println("2… Find the value of a number cubed (NOTE: 23 = 2 x 2 x 2)");
            System.out.println("3… Find the value of a number, to any power");
            System.out.println("4… Exit");
            choice = scan.nextInt();
            //num = 0;
            //pow = 0;
            ans = 1;
            switch (choice) {
                    case 1:
                        System.out.println("Please enter the number you want to square");
                        num = scan.nextInt();
                        pow = 2;
                        for (int i = 0; i < pow; i++)
                        {
                            ans = ans * num;
                        }   System.out.println("Your answer is " + ans);
                        break;
                    case 2:
                        System.out.println("Please enter the number you want to cube");
                        num = scan.nextInt();
                        pow = 3;
                        for (int i = 0; i < pow; i++)
                        {
                            ans = ans * num;
                        }   System.out.println("Your answer is " + ans);
                        break;
                    case 3:
                        System.out.println("Please enter the base");
                        num = scan.nextInt();
                        System.out.println("Please enter the expoenent");
                        pow = scan.nextInt();
                        //System.out.println("to any power");
                        for (int i = 0; i < pow; i++)
                        {
                            ans = ans * num;
                        }   System.out.println("Your answer is " + ans);
                        break;
                    case 4:
                        System.out.println("goodbye");
                        break;
                    default:
                        break;
            }
        }
        while (choice != 4);
    }
    
}
