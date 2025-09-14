package javasatement;

import java.util.Scanner;

public class priceselling3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter  cost price:");
        int cp =sc.nextInt();

        System.out.println("Enter the selling price:");
        int sp = sc.nextInt();
        if(sp>cp){
            System.out.println("Your  profit is");
            System.out.println(sp-cp);
        }
//        if(sp<cp){
//            System.out.println("You  incurred a loos");
//        }
        else {
            System.out.print("Your loos is:");
            System.out.println(cp-sp);
        }
    //System.out.println();
    }

    }

