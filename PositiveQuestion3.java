package javasatement;

import java.util.Scanner;

public class PositiveQuestion3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");

        int n = sc.nextInt();
        if(n%5==0 || n%3==0){
            System.out.println("The number is divisible by 3 and 5");
        }
        else {
            System.out.println("not divisible by 3 and 5");
        }


    }
}
