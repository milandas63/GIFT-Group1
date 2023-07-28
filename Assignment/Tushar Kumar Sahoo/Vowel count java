import java.io.*;

public class VowelCount {
    static int VowelCount=0;
    public static void main(String[] args)throws IOException{
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the String : ");
        StringBuilder StrB= new StringBuilder(Br.readLine());
        for(int i=0;i<StrB.length();i++){
            if(StrB.charAt(i)=='a'||StrB.charAt(i)=='e'||StrB.charAt(i)=='i'||StrB.charAt(i)=='o'||StrB.charAt(i)=='u'
            ||StrB.charAt(i)=='A'||StrB.charAt(i)=='E'||StrB.charAt(i)=='I'||StrB.charAt(i)=='O'||StrB.charAt(i)=='U'){
                VowelCount++;
            }
        }
        System.out.println("\n"+StrB+" Contains "+VowelCount+" Number of Vowels");
    }
}
