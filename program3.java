
import java.util.*;
public class program3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
		int x=sc.nextInt();
        System.out.println("Enter the 2nd Number: ");
		int y=sc.nextInt();
        System.out.println("Enter the 3nd Number: ");
		int z=sc.nextInt();

        if (x>y && x>z) {
            System.out.println("The greatest number is" +x);
        } 
        else if(y>x &&y>z) {
            System.out.println("The greatest number is " +y);
        }
        else  {
            System.out.println("The greatest number is " +z);
        }
    }
}