package schoolContest19;

import java.util.Scanner;

public class PangDing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s  = input.nextLine();
        s = s.toUpperCase();
        int mark = -1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='A'&&s.charAt(i)<='Z'){
                mark = i;
            }
        }
        if(mark==-1){
            System.out.println("NO");
            return;
        }
        char ch = (s.charAt(mark));
        if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='Y'){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
