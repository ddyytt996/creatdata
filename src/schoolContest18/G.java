package schoolContest18;

import java.util.Scanner;

public class G {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n =input.nextLong();
        long m =input.nextLong();
        long k = input.nextLong();
        long sum = 0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                sum += input.nextLong();
            }
        }
        if(sum>=k){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
    }
}
