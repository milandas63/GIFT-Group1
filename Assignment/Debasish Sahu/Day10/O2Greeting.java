import java.io.*;
public class InNShow {
    public static void main(String[] args)throws IOException{
        BufferedReader Br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a your name : ");
        String Name=new String(Br.readLine());
        
        System.out.println("Hello! "+Name+" Have a great day");
    }
}
