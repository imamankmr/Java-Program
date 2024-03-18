
import java.util.*;
public class program7 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a Number");
        int i =sc.nextInt();
        int a =1;
        int cnt=0;
        while(a<=i){
            if(i%a==0){
            // System.out.println("factors of number are :" +a);
            cnt++;
            }
          a++;
        }
        System.out.println("The total factors  are :" +cnt);
    }
}