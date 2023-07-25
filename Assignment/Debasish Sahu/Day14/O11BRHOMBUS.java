import java.io.*;
public class O11BRHOMBUS {
    public static void main(String[] args)throws IOException{
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("HEIGHT : ");
        Integer Height = Integer.parseInt(Br.readLine());
        for(int i=0;i<Height.intValue();i++){
            for(int j=i+1;j<Height.intValue();j++){
                System.out.print(" ");
            }
            for(int j=0;j<((2*i)+1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<Height.intValue();i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<(Height.intValue()-i-1)*2+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
