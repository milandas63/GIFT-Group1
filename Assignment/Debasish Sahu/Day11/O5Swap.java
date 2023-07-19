import java.io.*;
public class O5Swap {
    public static void main(String[] args)throws IOException{
        BufferedReader Br= new BufferedReader(new InputStreamReader(System.in));
        System.out.print("1ST VALUE : ");
        Integer a= Integer.parseInt(Br.readLine());
        System.out.print("2ND VALUE : ");
        Integer b= Integer.parseInt(Br.readLine());
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("AFTER SWAPPING 1ST VALUE : "+a);
        System.out.println("AFTER SWAPPING 2ND VALUE : "+b);
    }
}
