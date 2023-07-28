/*      Write a program to reverse the words in a given String?
	      Example: God is Omnipotent and Omniscient
	      Result:  Omniscient and Omnipotent is God
 */
public class reverse_string02 {

    public static void main(String[] args) {
        String text = "Perhaps they are not stars in the sky";
        System.out.println("The Entered String:"+" " + text);
        String arr[] = text.split(" ");
        System.out.print("The reverse String:"+" ");
        for(int i=arr.length-1; i>=0; i--) {
            System.out.print(arr[i]+" ");
        }
    }
}
