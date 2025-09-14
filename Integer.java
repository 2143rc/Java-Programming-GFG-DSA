package javasatement;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Integer {
    public static void main(String[] args) {
        Scanner sb =new Scanner(System.in);
        System.out.println("Enter the number:");

        double n =sb .nextDouble();//3.1415
         int x =(int)n;
         if(n-x > 0) System.out.println("not an integer");

         else System.out.println("Is an integer");


    }
}
