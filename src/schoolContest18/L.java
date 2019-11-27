package schoolContest18;

import java.util.Scanner;

public class L {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        int nums[] = new int[s.length()+5];
        for(int i=1;i<=s.length();i++){
            nums[i] = Integer.parseInt(s.charAt(i-1)+"");
        }
        int sum = 0;
        int flag = 0;
        for(int i = s.length();i>=1;i--){
            if(i==1){
                if(flag==1){
                    sum += nums[i]-1;
                }else{
                    sum += nums[i];
                }
                break;
            }
            if(flag==1){
                if(nums[i]-1<9){
                    sum += nums[i]-1+10;
                    flag = 1;
                }else{
                    sum += nums[i];
                    flag = 0;
                }
            }else{
                if(nums[i]==9){
                    sum += nums[i];
                    flag = 0;
                }else{
                    sum += nums[i]+10;
                    flag = 1;
                }
            }
        }
        System.out.println(sum);
    }
}
