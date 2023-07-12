package algo;
import java.io.*;
public class count_vowels {

	public static void main(String[] args)throws IOException {
	int count=0;
	 BufferedReader Br= new BufferedReader(new InputStreamReader(System.in));
	 System.out.println("Enter a string");
	 String Name=new String(Br.readLine());
	  for(int i=0;i<Name.length();i++)
		if(Name.charAt(i)=='A' ||Name.charAt(i)=='E' || Name.charAt(i)=='I' || Name.charAt(i)=='O' || Name.charAt(i)=='U'
		  ||Name.charAt(i)=='a'||Name.charAt(i)=='e'|| Name.charAt(i)=='i' ||Name.charAt(i)=='o' ||Name.charAt(i)=='u')
		 count++;
	  
    System.out.println("no of vowels present in a string\n"+count);
	}

}
