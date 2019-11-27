package schoolContest19;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long a =input.nextLong();
        long b = input.nextLong();
        b %= 2019;
        if (b!=0){
            System.out.println((a*b*b-a*b+2)%2019);
        }else {
            System.out.println(1);
        }

    }
}
