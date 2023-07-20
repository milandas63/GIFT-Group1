import java.io.*;

public class O7AddOrMul {
    public static void main(String[] args)throws IOException{
        BufferedReader Br= new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ending Point : ");
        Integer end=Integer.parseInt(Br.readLine());
        System.out.print("\n\n"+
        "1)Add from 1 to "+end+"\n"+
        "2)Multiply from 1 to "+end+"\n\n"+"Your Choice : ");
        Integer Ch=Integer.parseInt(Br.readLine());
        if(Ch==1){
            System.out.println("Addition of 1 to "+end+" = "+((end*(end+1))/2));
        }
        else if(Ch==2){
            int mult=1;
            for(int i=1;i<=end;i++){
                mult=mult*i;
            }
            System.out.println("Multiplication of 1 to "+end+" = "+mult);
        }
        else{
            System.out.println("Wrong Choices THank you");
        }

    }
}
