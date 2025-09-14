package javasatement;

import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Entre number");
        int n = sc.nextInt();

        if(n%5==0){
            System.out.println("The number you entered is divisible by5");
            System.out.println("Good Morning");
        }
        else{
            System.out.println("Not divisible by 5");
            System.out.println("Good Evening");
        }
    }
}
