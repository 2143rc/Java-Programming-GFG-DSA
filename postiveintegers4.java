package javasatement;

import java.util.Scanner;

public class postiveintegers4 {
    public static void main(String[] args) {
        //System.out.println("Enter the number:");
        //Largest number check code
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first  number:");
        int a = sc.nextInt();

        System.out.println("Enter the Second number:");
        int b = sc.nextInt();

        System.out.println("Enter the  third number:");
        int c = sc.nextInt();

        if (a>b && a>c){
            System.out.println(a+"is Largest");
        }
        if(b>a && b>c){
            System.out.println(b+"Is Largest");

            //else if(b>a&& b>c){
            //System.out.println(b+"is Largest);
            // }
//            else{
//                System.out.println(c+"is largest);
//            }
        }
        if(c>a && c>b){
            System.out.println(c+"Is Largest");
        }

    }
    }

