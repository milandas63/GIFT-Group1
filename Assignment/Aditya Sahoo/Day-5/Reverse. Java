import java.io.*;
import java.lang.*;

public class TotalReverse {
    public static void main(String[] args)throws IOException{
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the String you want to reverse : ");

        //String Sen=Br.readLine();
        System.out.println("Reversed String : "+Rev(Br.readLine()));
    }

    public static String Rev(String Str){
        char st[]=Str.toCharArray();
        for(int i=0;i<Str.length()/2;i++){
            char c=st[i];
            st[i]=st[Str.length()-i-1];
            st[Str.length()-i-1]=c;
        }
        return (new String(st));
    }
}
