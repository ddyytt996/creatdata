package schoolContest18;

import java.util.Scanner;

public class H {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int cntji = 0;
        int cntou = 0;
        for(int i=1;i<=n;i++){
            if(input.nextInt()%2==0){
                cntou++;
            }else{
                cntji++;
            }
        }
        int lun = n - m;
        int fulun = 0;
        int mulun = 0;
        if(lun%2==0){
            fulun = lun/2;
            mulun = fulun;
        }else{
            fulun = lun/2+1;
            mulun  = fulun-1;
        }
        //System.out.println(fulun +" "+mulun+" "+cntji+" "+cntou);
        if(lun==0){
            if(cntji%2==0){
                System.out.println("P win");
                return;
            }else{
                System.out.println("F win");
                return;
            }
        }
        if(cntou<=fulun){
            if((cntji-mulun-fulun+cntou)%2==1){
                System.out.println("F win");
                return;
            }
        }
        if(cntji<=mulun){
            System.out.println("P win");
            return;
        }
        if(cntou<=mulun){
            if((cntji-mulun-fulun+cntou)%2==0){
                System.out.println("P win");
                return;
            }
        }
        if(lun%2==0){
            System.out.println("P win");
            return;
        }else{
            System.out.println("F win");
            return;
        }
    }
}
