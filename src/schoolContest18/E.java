package schoolContest18;

import java.util.Arrays;
import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        long nums[] = new long[n+5];
        for(int i=1;i<=n;i++){
            nums[i] = input.nextLong();
        }
        Node2 mofa[] = new Node2[k+5];
        for(int i=1;i<=k;i++){
            long a = input.nextLong();
            long b = input.nextLong();
            mofa[i] = new Node2(a,b);
        }
        Arrays.sort(nums,1,n+1);
        long totalAdd = 0;
        long totalSub = 0;
        for(int i=1;i<=n;i++){
            totalAdd += nums[i]*(i-1);
            totalSub += nums[i]*(n-i);
        }
        long mp = totalAdd-totalSub;
        Arrays.sort(mofa,1,k+1);
        int cnt = 0;
        int index = 1;
        while (mp>0){
            if(mp>=mofa[index].a*mofa[index].b){
                mp -= mofa[index].a*mofa[index].b;
                cnt += mofa[index].b;
            }else{
                if(mp<mofa[index].b){
                    break;
                }else{
                    cnt += mp/mofa[index].a;
                }
            }
            index++;
            if(index>k){
                break;
            }
        }
        System.out.println(cnt);
    }
}class Node2 implements Comparable<Node2>{
    public Node2(long a1 , long b2){
        a = a1;
        b = b2;
    }
    public int compareTo(Node2 o){
        if(a>o.a){
            return 1;
        }
        else if(a<o.a){
            return -1;
        }else{
            return 0;
        }
    }
    long a,b;
}
