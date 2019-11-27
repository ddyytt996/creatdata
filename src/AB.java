import java.util.Arrays;
import  java.util.Scanner;
public class AB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n =input.nextInt();
        //换行
        input.nextLine();
        for(int p = 1;p<=n;p++){
            //输入第一行数据
            String s = input.nextLine();
            //把第一行数据以空格为分隔，分成字符串数组
            String[] ss = s.split(" ");
            //创建一个类数组，Node类中有一个字符串和两个整数
            Node node[] = new Node[ss.length];
            for(int i=0;i<node.length;i++){
                //把每一小组数据，以":"为间隔分成一个长度为2的String数组，
                String[] sss = ss[i].split(":");
                //为node[i]，创建对象并赋值，没错java就是这么麻烦
                node[i] = new Node();
                node[i].s = sss[0];
                String[] ssss = sss[1].split(",");
                node[i].a = Integer.parseInt(ssss[0]);
                node[i].b = Integer.parseInt(ssss[1]);
            }
            //为类数组排序
            Arrays.sort(node);
            //按格式输出
            for(int i=0;i<node.length;i++){
                if(p==n&&i==node.length-1){
                    System.out.print(node[i].s+":"+(node[i].a+node[i].b));
                    continue;
                }
                System.out.println(node[i].s+":"+(node[i].a+node[i].b));
            }
            if(n!=p){
                System.out.println();
            }
        }
    }
}
//定义的一组数的类
class Node implements Comparable<Node> {
    @Override
    //大小比较按照s的字典序
    public int compareTo(Node o) {
        return s.compareTo(o.s);
    }
    int a,b;
    String s;
}