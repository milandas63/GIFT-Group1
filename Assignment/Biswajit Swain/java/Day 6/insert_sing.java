/*
Flip/Invert/Toggle the case of all characters in a given String?
        Original:   Quick Brown Fox Jumps Over The Lazy Dog
        Invert:     qUICK bROWN fOX jUMPS oVER tHE lAZY dOG
 */
public class invert_string {
    public static void main(String[]args){
        String str ="Quick Brown Fox Jumps Over The Lazy Dog";
        char[] arr = str.toCharArray();
        System.out.println("The Entered String:"+" " + str);
        for(int i=0;i<arr.length;i++){
            char c=arr[i];
            if(Character.isUpperCase(c)){
                arr[i]=Character.toLowerCase(c);
            }
            else if(Character.isLowerCase(c)){
                arr[i]=Character.toUpperCase(c);
            }
        }
        System.out.print("The inverted String:"+" " );
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"");
        }
        }

    }