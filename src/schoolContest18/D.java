package schoolContest18;

import java.math.BigInteger;
import java.util.Scanner;
//BigInteger自动删除前导0
public class D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        BigInteger num = new BigInteger(s,2);
        String ans = num.toString(16);
        int cnt = 0;
        for(int i=0;i<ans.length();i++){
            if(ans.charAt(i)=='4'||ans.charAt(i)=='0'||ans.charAt(i)=='6'||ans.charAt(i)=='9'||ans.charAt(i)=='a'||ans.charAt(i)=='b'||ans.charAt(i)=='d'){
                cnt++;
            }if(ans.charAt(i)=='8'){
                cnt += 2;
            }
        }
        System.out.println(cnt);

    }
}
