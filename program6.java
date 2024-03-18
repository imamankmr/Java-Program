
import java.util.*;
public class program6 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a Number");
        int i =sc.nextInt();
        int a =1;
        while(a<=i){
            if(i%a==0)
            System.out.println("factors of number are :" +a);
          a++;
        }
        
    }
}
