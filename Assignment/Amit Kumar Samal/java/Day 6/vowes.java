import java.util.Arrays;

public class vowels {
    public static void main(String[] args) {
        String college = "Gandhi Institute For Thecnology";
        char[] arr = college.toCharArray();
        // System.out.println(Arrays.toString(arr));
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'A' || arr[i] == 'a') {
                count += 1;
            }
            if (arr[i] == 'E' || arr[i] == 'e') {
                count += 1;
            }
            if (arr[i] == 'I' || arr[i] == 'i') {
                count += 1;
            }
            if (arr[i] == 'O' || arr[i] == 'o') {
                count += 1;
            }
            if (arr[i] == 'U' || arr[i] == 'u') {
                count += 1;
            }
        }
        System.out.println(college);
        System.out.println("The number of vowels present in string : " + count);
    }
}