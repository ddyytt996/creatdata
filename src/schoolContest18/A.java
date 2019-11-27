package schoolContest18;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n =input.nextInt();
        int x = input.nextInt();
        int y =input.nextInt();
        String s = input.next();
        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='L'){
                if(x!=1){
                    x--;
                }
            }
            if(ch=='R'){
                if(x!=n){
                    x++;
                }
            }
            if(ch=='U'){
                if(y!=n){
                    y++;
                }
            }
            if(ch=='D') {
                if (y != 1) {
                    y--;
                }
            }
        }
        System.out.println(x+","+y);
    }
}
