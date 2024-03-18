import java.util.*;

public class program10 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a Number");
        int a =sc.nextInt();
        int cnt=0;
        while(a!=0){
            int  b=a%10;
            cnt++;
            a=a/10;
        }
        System.out.println("total digtits"+cnt);
    }
}

// Program No 9 loop based programs