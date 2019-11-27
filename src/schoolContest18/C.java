package schoolContest18;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n =input.nextInt();
        char map[][] = new char[n+5][];
        for(int i = 1;i<=n;i++){
            String s = input.next();
            map[i] = s.toCharArray();
        }
        Node1[] node1 = new Node1[n+5];
        int cnt = 0;
        for(int i=1;i<=n;i++){
            for(int j=0;j<n;j++){
                if(j==0||j==n-1||i==1||i==n){
                    continue;
                }
                if(map[i][j]=='$'&&map[i][j-1]=='$'&&map[i][j+1]=='$'&&map[i-1][j]=='$'&&map[i+1][j]=='$'){
                    node1[cnt++] = new Node1(i,j+1);
                    map[i][j]='!';
                    map[i][j-1]='!';
                    map[i][j+1]='!';
                    map[i-1][j]='!';
                    map[i+1][j]='!';
                }
            }
        }
        boolean win = true;
        loop1:for(int i=1;i<=n;i++){
            for(int j=0;j<n;j++){
                if(map[i][j]=='$'){
                    win = false;
                    break loop1;
                }
            }
        }
        if(win){
            System.out.println("YES");
        }else{
            System.out.println("NO");
            return;
        }
        for(int i=0;i<cnt;i++){
            if(i==cnt-1){
                System.out.println("("+node1[i].a+","+node1[i].b+")");
                break;
            }
            System.out.print("("+node1[i].a+","+node1[i].b+") ");
        }
    }
}
class Node1{
    public Node1(int a1 ,int b1){
        a = a1;
        b = b1;
    }
    int a , b;
}