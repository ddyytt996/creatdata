import java.util.Scanner;

public class Guilv {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i=1;i<=n;i++){
            int a = input.nextInt();
            int b = input.nextInt();
            if(a==0||b==0){
                System.out.println("YES");
                continue;
            }
            int sum = a+b -2;
            if(sum%2==0){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }

        }
    }
}
