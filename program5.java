
public class program5 {
    public static void main(String[] args) {
        int i=1;
        int cnt =0;
        while(i<=500){
            if(i%7==0 && i%10==7){
                // System.out.println("the required number divisible by 7 or ends with 7 are"+i);
                cnt++;
            }
            
            i++;
          
        }
      System.out.println("The total of elements that are divisible by 7 and ends with 7 are :" +cnt);
    }
}