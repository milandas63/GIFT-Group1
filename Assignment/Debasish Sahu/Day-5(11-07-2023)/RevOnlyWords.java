
import java.io.*;

public class RevOnlyWords{
    public static void main(String[] args)throws IOException{

        /*InputStreamReader ISR= new InputStreamReader(System.in);
        BufferedReader Br= new BufferedReader(ISR);*/
        BufferedReader Br= new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the String : ");

        String Sen=" "+Br.readLine();
        String Reverse=new String("");
        String Words= new String("");

        for(int i=Sen.length()-1;i>=0;i--){
            if(Sen.charAt(i)!=' '){
                Words+=Sen.charAt(i);
            }
            else{
                Reverse+=StrRev(Words)+" ";
                //System.out.println("Reversed Word is found to be : "+Reverse);
                Words="";
            }
        }
        System.out.println("Reversed Sentence : "+Reverse);
    }
    public static String StrRev(String Str){
        String Rev="";
        for(int i=Str.length()-1;i>=0;i--){
            Rev+=Str.charAt(i);
        }
        //System.out.println("In Reversing Function Returning : "+Rev);
        return Rev;
    }
}
