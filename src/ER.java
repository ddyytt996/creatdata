public class ER {
    public static final  long mod = 100000007;
    public static final long dp[] = new long[100005];
    public static void main(String[] args) {
        double mem = 0;
        for(int i=10000;i<=100000;i+=10000){
            double e = mem;
            double flag = 1;
            for(int j= i-10000;j<=i;j++){
                e += 1.0/(jiecheng(j)*1.0);
            }
            mem = e;
            System.out.printf("%d      %.15f\n",i,e);
        }
    }
    public static long jiecheng(int num){
        long ans = 1;
        if(num!=0){
            if(dp[num-1]!=0){
                dp[num] = (dp[num-1]*num)%mod;
                return dp[num]%mod;
            }
        }
        for(long i=1;i<=num;i++){
            ans = (i*ans)%mod;
        }
        dp[num] = ans;
        return ans%mod;
    }
}
