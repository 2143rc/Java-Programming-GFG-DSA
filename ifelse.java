package javasatement;

import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int n = sc.nextInt();
        //System.out.println(n*n);
        if(n%2==0){
            System.out.println("The number you entered is even");
        }
//        if(n%2 !=0){//
//            System.out.println("The number is odd");

        else {
            System.out.println("The number is odd");

        }
    }
}

