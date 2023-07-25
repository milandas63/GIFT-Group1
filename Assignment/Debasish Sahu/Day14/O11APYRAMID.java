import java.io.*;
public class O11APYRAMID {
    public static void main(String[] args)throws IOException{
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("HEIGHT : ");
        Integer Height = Integer.parseInt(Br.readLine());
        for(int i=0;i<Height.intValue();i++){
            for(int j=1+i;j<Height.intValue();j++){
                System.out.print(" ");
            }
            for(int j=0;j<((2*i)+1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
