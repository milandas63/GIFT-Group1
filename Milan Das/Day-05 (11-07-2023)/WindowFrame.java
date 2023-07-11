import java.awt.*;

public class WindowFrame {
	public static void main(String[] args) {
		Frame f = new Frame("Puzzle Window");
		f.setBounds(300,200,500,350);
		f.setVisible(true);
	}
}


//	Generate all prime numbers between 2000 through 5000
class PrimeNumber {
	public static void main(String[] args) {
		int start = 2000;
		int end = 5000;
		int count = 0;
		boolean yesPrime;
		String title = new String("PRIME NUMBER GENERATOR");
		for(int i=start; i<=end; i++) {
			yesPrime = true;
			for(int j=2; j<i; j++) {
				if(i%j==0) {
					yesPrime = false;
					break;
				}
			}

			if(yesPrime) {
				System.out.print(i+" ");
				count++;
				if(count>=10) {
					count = 0;
					System.out.println();
				}
			}
		}
	}
}