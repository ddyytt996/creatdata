import java.io.*;

public class CreatMachine {
    public static void main(String[] args) throws Exception {
        for(int i=1;i<=10;i++){
            BufferedWriter bw = new BufferedWriter(new FileWriter("inputData/"+i+".in"));
            BufferedWriter bw1 = new BufferedWriter(new FileWriter("outputData/"+i+".out"));
            for(int j=1;j<=19;j++){
                for(int k=1;k<=19;k++){
                    if(k==19){
                        bw.write(0+"");
                    }else {
                        bw.write(0+" ");
                    }
                }
                if(j!=19){
                    bw.write("\n");
                }
            }
            if(i<=5){
                bw1.write("ZH WIN");
            }else{
                bw1.write("LCB WIN");

            }
            bw.close();
            bw1.close();
        }
    }
}
