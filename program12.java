import java.util.*;

public class program12 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a Number");
        int a =sc.nextInt();
        int c=0;
        while(a!=0){
            int  b=a%10;
           if(b%2==0){
            c=b;
           } 
            a=a/10;
        }
        System.out.println("total digtits"+c);
    }
}
