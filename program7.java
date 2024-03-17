

//  11 Problem Javac_java if else;

import java.util.*;
public class program7 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter 1st  side angle of triangle");
        int x =sc.nextInt();
        System.out.println("enter 2nd side angle of triangle");
        int y =sc.nextInt();
        System.out.println("enter 3rd side angle of triangle");
        int z =sc.nextInt();
        if(x+y+z==180){
            System.out.println("It is a valid triangle");
        }
        else{
            System.out.println("Not a valid triangle");
        }
    }


}
