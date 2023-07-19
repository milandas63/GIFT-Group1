import java.io.*;

public class O4Sum {
    public static void main(String[] args)throws IOException{
        BufferedReader Br= new BufferedReader(new InputStreamReader(System.in));
        System.out.print("LENGTH : ");
        Integer length=Integer.parseInt(Br.readLine());
        int sum=(length.intValue()*(length.intValue()+1))/2;
        System.out.println("Sum from 1 to "+length+" = "+sum);
    }
}
