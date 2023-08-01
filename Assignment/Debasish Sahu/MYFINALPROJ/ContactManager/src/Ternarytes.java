import java.io.*;

public class Ternarytes {
    public static void main(String[] args)throws IOException{
        BufferedReader Br= new BufferedReader(new InputStreamReader(System.in));
        System.out.print("YOUR AGE: ");
        Integer age=Integer.parseInt(Br.readLine());
        
        if(18<((age>30)?36:15)){
            System.out.println("36");
        }
        
    }
}
