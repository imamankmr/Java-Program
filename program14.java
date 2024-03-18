import java.util.*;

public class program14 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter  Number a");
        int a =sc.nextInt();
        System.out.println("Enter  Number b");
        int b =sc.nextInt();
       int i=1;
       int pow=1;
        while(i<=b){
            pow= pow*a;
            i++;
        }
        System.out.println("power of a and b is "+pow);
    }

 }
       