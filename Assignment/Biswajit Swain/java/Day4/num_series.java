/*
    Complete the series of 10 numbers in the series?
     1, 3, 5, 11, 21, ......      (n, n*2+1, n*2-1, n*2+1, n*2-1, ...
 */
public class Num_Series{
    public static void main(String[] args) {
        int num=1;
        System.out.print(num + " ");
        for(int i=1;i<=10;i++){
            if(i%2==0){
                num=num*2-1;
                System.out.print(num + " ");
            }
            else{
                num=num*2+1;
                System.out.print(num + " ");
            }
        }
    }
}