package javasatement;

import java.util.Scanner;

public class divisiblebbnumbe3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int  n = sc.nextInt();
        if(n%5==0 && n%3==0){//if(n%15==0) this on also valid
            System.out.println("The number is divisible by 3 and 5 ");
        }
        else {
            System.out.println("Not divisible by 3 and by 5");
        }
    }
}
