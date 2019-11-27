package dfs;

import java.util.Scanner;

public class Jielong {
    public static int[][] chongdie = new int[25][25];
    public static String[] words = new String[25];
    public static int cnt[] = new int[25];
    public static int num = 0;
    public static int ans = 0;
    public static int n;
    //预处理
    public static int yuchu(int a,int b){
        String s1;
        String s2;
        if(words[a].length()>=words[b].length()){
            s1 = words[a];
            s2 = words[b];
        }else {
            s2 = words[a];
            s1 = words[b];
        }
        int n =s2.length();
        String ss1="";
        String ss2="";
        for(int i=1;i<=n-1;i++){
            ss2 = words[b].substring(0,0+i);
            ss1 = words[a].substring(words[a].length()-i,words[a].length());
            if(ss2.equals(ss1)){
                return i;
            }
        }
        return 0;
    }
    public static void dfs(int qian){
        for(int i=1;i<=n;i++){
            if(chongdie[qian][i]!=0){
                if(cnt[i]>=2){
                    continue;
                }
                cnt[i]++;
                int index = num;
                num += words[i].length();
                num -= chongdie[qian][i];
                dfs(i);
                cnt[i]--;
                ans = Math.max(num,ans);
                num = index;
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        for(int i=1;i<=n;i++){
            words[i] = input.next();
        }
        String ch1 = input.next();
        char ch = ch1.charAt(0);
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                chongdie[i][j] = yuchu(i,j);
            }
        }
        for(int i=1;i<=n;i++){
            if(words[i].charAt(0)==ch){
                cnt[i]++;
                int index = num;
                num += words[i].length();
                dfs(i);
                cnt[i]--;
                ans = Math.max(num,ans);
                num = index;
            }
        }
        System.out.println(ans);
    }
}
