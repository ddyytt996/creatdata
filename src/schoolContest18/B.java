package schoolContest18;

import java.math.BigInteger;
import java.util.Scanner;
/*
    同余定理不能整除，则不能先余数再除法，公式计算小心，int丢失精度
 */
public class B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()){
            long n = input.nextLong();
            n++;
            BigInteger n1 = new BigInteger(n+"");
            BigInteger n2 = new BigInteger((n+1)+"");
            BigInteger n3 = new BigInteger(((2*n)+1)+"");
            BigInteger sum1 = n1.multiply(n2).divide(new BigInteger("3"));
            BigInteger sum2 = n1.multiply(n2).multiply(n3).divide(new BigInteger("6"));
            BigInteger sum3 = sum1.add(sum2).divide(new BigInteger("2")).subtract(new BigInteger("2"));
            BigInteger ans = sum3.remainder(new BigInteger("2048"));
            System.out.println(ans.toString());
        }
    }
}
