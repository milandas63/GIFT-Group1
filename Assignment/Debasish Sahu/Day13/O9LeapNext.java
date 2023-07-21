import java.io.*;
import java.util.*;

public class O9LeapNext {
    public static void main(String[] args)throws IOException{
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("How many leap years : ");
        Integer Len=Integer.parseInt(Br.readLine());
        Date Y= new Date();
        Integer CY=1900+Y.getYear();int count,i;
        count=i=0;
        while(count<21){
            if((CY+i)%4==0&&(CY+i)%100!=0){
                System.out.println("Leap Year : "+(CY.intValue()+i));
                count++;
            }
            i++;
        }
    }
}
