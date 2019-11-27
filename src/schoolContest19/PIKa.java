package schoolContest19;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.*;
import java.math.BigInteger;
import java.util.*;
public class PIKa {
    public static int a[]=new int[5];
    public static void main(String[]args) {
        InputReader input = new InputReader();
        int n = input.nextInt();
        for(int i=0;i<n;i++) {
            int ans=input.nextInt();
            int a1 ;
            a[ans]++;
        }
        if(a[1]>a[2]) {
            int temp=a[2];
            a[1]-=temp;
            a[2]=0;
            a[3]+=temp;
            int count=a[1]/3;
            a[3]+=count;
            temp+=count*2;
            if(a[1]%3==0)
                System.out.println(temp);
            else {
                if(a[1]%3==1) {
                    if(a[3]>0)
                        System.out.println(temp+1);
                    else if(a[4]>0)
                        System.out.println(temp+2);
                    else
                        System.out.print("-1");
                }else {
                    if(a[3]>=2)
                        System.out.println(temp+2);
                    else if(a[4]>0)
                        System.out.println(temp+2);
                    else {
                        System.out.println("-1");
                    }
                }
            }
        }else if(a[1]<a[2]) {
            int temp=a[1];
            a[1]=0;
            a[2]-=temp;
            a[3]+=temp;
            int count=a[2]/3;
            temp+=count*2;
            a[3]+=count*2;
            if(a[2]%3==0)
                System.out.println(temp);
            else if(a[2]%3==1) {
                if(a[4]>0)
                    System.out.println(temp+1);
                else if(a[3]>=2)
                    System.out.println(temp+2);
                else {
                    System.out.println("-1");
                }
            }else {
                System.out.println(temp+2);
            }
        }else {
            System.out.println(a[1]);
            return ;
        }
        System.gc();
    }
}
class InputReader{
    BufferedReader buf;
    StringTokenizer tok;
    InputReader()
    {
        buf = new BufferedReader(new InputStreamReader(System.in));
    }
    boolean hasNext()
    {
        while(tok == null || !tok.hasMoreElements())
        {
            try
            {
                tok = new StringTokenizer(buf.readLine());
            }
            catch(Exception e)
            {
                return false;
            }
        }
        return true;
    }
    String next()
    {
        if(hasNext()) return tok.nextToken();
        return null;
    }
    int nextInt()
    {
        return Integer.parseInt(next());
    }
    long nextLong()
    {
        return Long.parseLong(next());
    }
    double nextDouble()
    {
        return Double.parseDouble(next());
    }
    BigInteger nextBigInteger()
    {
        return new BigInteger(next());
    }
    BigDecimal nextBigDecimal()
    {
        return new BigDecimal(next());
    }
}