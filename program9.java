import java.util.*;

public class program9 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a Number");
        int a =sc.nextInt();
        int cnt=0;
        while(a!=0){
            int  b=a%10;
            if(b%2==0){

            
            cnt++;
            }
            a=a/10;
        }
        System.out.println("total  even digtits"+cnt);
    }
}