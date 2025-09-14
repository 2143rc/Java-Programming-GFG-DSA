package BasicCode;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        int n =sb.nextInt();

//        if(n%2==0) System.out.println("even");
//        else System.out.println("odd");
        System.out.println((n%2==0)?"even:":"odd");
    }

}
