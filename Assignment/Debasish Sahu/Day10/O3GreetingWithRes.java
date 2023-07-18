import java.io.*;

public class O3GreetingWithRes {
    public static void main(String[] args)throws IOException{
        BufferedReader Br= new BufferedReader(new InputStreamReader(System.in));

        String Name=Br.readLine();
        if((Name.split(" "))[0]=="Alice"||Name.split(" ")[0]=="Bob"){
            System.out.println("Hello! "+Name+", Have great day.");
        }
    }
}