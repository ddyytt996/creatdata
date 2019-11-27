import java.io.*;
public class Suiji {
    public static void main(String[] args) throws IOException {
        String names = "张志昂 霍玉康 高瑞超 杨志恒 潘英祖 王泽贤 王胜 黄佳慧 刘子焱 李美青 李忠悦 李紫怡 马祥雪 任兆杰 王法福 王月 武秋菊 谢凤蒙 初钰莹 王洁 王世豪 王雪慧 杨轲 陈名帅 冯梦真 沈泽奇";
        String[] name = names.split(" ");
        int cnt1 = 1;
        int cnt2 = 1;
        String zu1[] = new String[15];
        String zu2[] = new String[15];
        for(int i=0;i<name.length;i++){
            int num = (int)(Math.random()*2+1);
            if(num==1&&cnt1<14){
                zu1[cnt1++] = cnt1-1+name[i];
            }else if(cnt2<14){
                zu2[cnt2++] = cnt2-1+name[i];
            }else {
                zu1[cnt1++] = cnt1-1+name[i];
            }
        }
        System.out.println("1组名单");
        for(int i=1;i<=13;i++){
            System.out.println(zu1[i]);
        }
        System.out.println("2组名单");
        for(int i =1;i<=13;i++){
            System.out.println(zu2[i]);
        }

    }
}
