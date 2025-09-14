package javasatement;

import java.util.Scanner;

public class profitlLoss {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int cp = sc.nextInt();
        System.out.println("Enter Cp:");
        int sp =sc.nextInt();

        if(sp>=cp) System.out.println("Profit");
        else System.out.println("Loss");
    }
}
