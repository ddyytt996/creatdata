package schoolContest18;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class K {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        if(s.split("\\+").length==2){
            String ss[] = s.split("\\+");
            System.out.printf("%d",Integer.parseInt(ss[0])+Integer.parseInt(ss[1]));
        }
        if(s.split("-").length==2){
            String ss[] = s.split("-");
            System.out.printf("%d",Integer.parseInt(ss[0])-Integer.parseInt(ss[1]));
        }
        if(s.split("\\*").length==2){
            String ss[] = s.split("\\*");
            System.out.printf("%d",Integer.parseInt(ss[0])*Integer.parseInt(ss[1]));
        }
        if(s.split("/").length==2){
            String ss[] = s.split("/");
            double a = Integer.parseInt(ss[0])*1.0/Integer.parseInt(ss[1]);
            //精度格式，0.#是8/2结果为4,.0被省略
            DecimalFormat formater = new DecimalFormat("0.0");
            //非四舍五入
            formater.setRoundingMode(RoundingMode.FLOOR);
            System.out.println(formater.format(a));
        }
    }
}
