package javasatement;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class OddEvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");

        int num = sc.nextInt();

        if(num %2==0){
            System.out.println("Number is Even ");
        } else {
            System.out.println("Number is Odd number");
        }

    }
}
