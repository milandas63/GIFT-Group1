import java.io.*;

public class RevByWords {
    public static void main(String[] Args)throws IOException{

        InputStreamReader ISR=new InputStreamReader(System.in);
        BufferedReader Br= new BufferedReader(ISR);

        System.out.print("Give the Sentence you want to Reverse : ");

        String Sen=Br.readLine()+" ";
        String Rev=new String("");
        String Words= new String("");
        
        for(int i=0;i<Sen.length();i++){
            if(Sen.charAt(i)!=' '){
                Words+=Sen.charAt(i);
            }
            else{
                Rev+=StrRev(Words)+" ";
                Words="";
            }
        }
        System.out.println("Reversed Sentence by Word's character : "+Rev);
    }
    public static String StrRev(String Str){
        String Rev="";
        for(int i=Str.length()-1;i>=0;i--){
            Rev+=Str.charAt(i);
        }
        return Rev;
    }
}
