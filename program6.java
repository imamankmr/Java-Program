import java.util.*;


 
public class program6 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int x=sc.nextInt();
        if(x%5==0){
           
            if(x%11==0){
                System.out.println("number is divisible by 5 and 11");
            }
            else{
                System.out.println("number is only divisible by 5");
            }
        }
        else{
            System.out.println("not divisible by 5 and 11");
        }
    }

}