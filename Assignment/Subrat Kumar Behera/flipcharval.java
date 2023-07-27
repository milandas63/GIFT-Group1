import java.io.*;

public class FlipCharVal {
    public static void main(String[] args)throws IOException{
        BufferedReader Br= new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Give the String : ");
        char StrB[]=new String(Br.readLine()).toCharArray();

        for(int i=0;i<StrB.length;i++){
            if(StrB[i]>='a'&&StrB[i]<='z'){
                System.out.println(StrB[i]);
                StrB[i]=(char)(((int)(StrB[i]))-32);
                System.out.println(StrB[i]);
            }
            else if(StrB[i]>='A'&&StrB[i]<='Z'){
                System.out.println(StrB[i]);
                StrB[i]=(char)(((int)(StrB[i]))+32);
                System.out.println(StrB[i]);
            }
        }

        System.out.println("Your Filped String : "+(new String(StrB)));
        
    }
}
