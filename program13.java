import java.util.*;

public class program13 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a Number");
        int a =sc.nextInt();
        int ans=1;
        for(int i=1;i<=a;i++){
           ans=ans*i;
        }
        System.out.println("factorial of number is"+ans);
    }
}