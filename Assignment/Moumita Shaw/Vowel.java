count the number of vowels in a given string
public class count_vowels{
 void vowels( string str){
   int count=0;
  for( int i=0;i<str.length();i++){
   char ch=str.charAt(i);
  if((ch=='a'||ch=='A')||(ch=='e'||ch=='E')||
     (;ch=='i'||ch=='I')||(ch=='o'||ch=='O')||
      ( ch=='u'||ch=='U'))
  }
    system.out.println("Number of vowels:"+count);
    }
     public static void main(string[]args){
      count_vowels obj=new count_vowels();
      scanner sc=new scanner(system.in);
      system.out.print("Input:");
      string str=sc.next();
         obj.vowels(str);
                       }
}
