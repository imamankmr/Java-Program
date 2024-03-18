 
 import java.util.*;

public class program8 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a Number");
        int a =sc.nextInt();

        for(int i=2 ;i<a;i++)
      
        {
            if(a%i==0){
                System.out.println(" not a prime number");
                break;
            }
            
        }
        System.out.println("a prime number");
    }
}