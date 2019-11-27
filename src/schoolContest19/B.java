package schoolContest19;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int ans = 1;
        for(int i=1;i<=n;i++){
            ans *= 2;
            ans %=2019;
        }
        System.out.println(ans);
    }
}
