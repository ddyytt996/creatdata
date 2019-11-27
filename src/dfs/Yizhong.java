package dfs;

import java.util.Scanner;

public class Yizhong {
    public static String[] strings = new String[105];//初始地图
    public static int[][] mem = new int[105][105];//标记
    public static String rode = "yizhong";
    public static int[][] steps = {{1,0},{1,1},{0,1},{-1,0},{0,-1},{1,-1},{-1,1},{-1,-1}};
    public static int[][] jilu = new int[7][2];
    public static int n;
    public static void dfs(int x,int y,int fangxiang,int index){
        if(index==7){
            for(int i=0;i<7;i++){
                mem[jilu[i][0]][jilu[i][1]] = 1;
            }
            return;
        }
        int xx = x + steps[fangxiang][0];
        int yy = y + steps[fangxiang][1];
        if(xx<0||yy<0||xx>=n||yy>=n){
            return;
        }
        if(strings[xx].charAt(yy)==rode.charAt(index)){
            jilu[index][0] = xx;
            jilu[index][1] = yy;
            dfs(xx,yy,fangxiang,index+1);
        }
        return;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        for(int i=0;i<n;i++){
            strings[i] = input.next();
        }
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                if(strings[i].charAt(j)=='y') {
                    jilu[0][0] = i;
                    jilu[0][1] = j;
                    for(int k=0;k<8;k++){
                        int xx = i + steps[k][0];
                        int yy = j + steps[k][1];
                        if(xx<0||yy<0||xx>=n||yy>=n){
                            continue;
                        }
                       // System.out.println("xx"+xx);
                        if(strings[xx].charAt(yy)==rode.charAt(1)){
                            jilu[1][0] = xx;
                            jilu[1][1] = yy;
                            dfs(xx,yy,k,2);
                        }
                    }
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mem[i][j]==0){
                    System.out.print("*");
                }else {
                    System.out.print(strings[i].charAt(j));
                }
            }
            System.out.println();
        }
    }
}

