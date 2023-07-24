import java.io.*;
public class O10SumSeries {
    final static boolean Odd=true,Even=false;
    static long SumS(int S,int E){
        long Sum=0;
        for(int i=S;i<=E;i++){
            Sum+=i;
        }
        return Sum;
    }
    static long SumS(int S, int E, boolean OE ){
        long Sum=0;
        if(OE==Odd){
            S=(S%2==1)?(S+0):(S+1);
        }
        else if(OE==Even){
            S=(S%2==0)?(S+0):(S+1);
        }
        for(int i=S;i<=E;i+=2){
            Sum+=i;
        }
        return Sum;
    }
    static long SumS(int S,int E,int D){
        S=(S%D==0)?(S+0):(S+(D-(S%D)));
        System.out.println(S);
        long Sum=0;
        for(int i=S;i<=E;i+=D){
            System.out.print(i+" + ");
            Sum+=i;
            System.out.println(Sum);
        }
        return Sum;
    }
    public static void main(String[] args)throws IOException{
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Starting Point : ");
        Integer Start=Integer.parseInt(Br.readLine());
        System.out.print("Ending Point : ");
        Integer End=Integer.parseInt(Br.readLine());
        System.out.println();
        System.out.println("\n\n"+
        "1)Sum of numbers From "+Start+" to "+End+"\n"+
        "2)Sum of all Odd Numbers From "+Start+" to "+End+"\n"+
        "3)Sum of all Even Numbers From "+Start+" to "+End+"\n"+
        "4)Sum of all Numbers With Different Divisibilty From "+Start+" to "+End+"\n\n"+
        "YOUR CHOICE : ");
        Integer Ch=Integer.parseInt(Br.readLine());
        if(Ch.intValue()==1){
            System.out.println("SUM OF ALL NUMBERS FROM "+Start+" TO "+End+" = "+
            SumS(Start,End));
        }
        else if(Ch.intValue()==2){
            System.out.println("SUM OF ALL ODD NUMBERS FROM "+Start+" TO "+End+" = "+
            SumS(Start,End,Odd));
        }
        else if(Ch.intValue()==3){
            System.out.println("SUM OF ALL NUMBERS FROM "+Start+" TO "+End+" = "+
            SumS(Start,End,Even));
        }
        else if(Ch.intValue()==4){
            System.out.print("Divisibility Number : ");
            Integer Div=Integer.parseInt(Br.readLine());
            System.out.println("SUM OF ALL NUMBERS FROM "+Start+" TO "+End+" = "+
            SumS(Start,End,(Div.intValue())));
        }
        else{
            System.out.println("\nWRONG CHOICE\n");
        }
    }
}
