package schoolContest18;

import java.util.Scanner;

public class I {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long min = (int)1e9;
        long sum =0;
        for(int i=1;i<=n;i++){
            long num = input.nextLong();
            if(num<min){
                min = num;
            }
            sum += num;
        }
        sum = sum-min+min*(n-1);
        System.out.println(sum);
    }
}
