public class Example {
	public static void main() {
		System.out.println("main()");
	}

	public static void main(String x) {
		System.out.println("main(String)");

	}

	public static void main(String[] args) {
		System.out.println("main(String[])");
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
		String[] names = {"Narendra","Modi","Jawaharlal","Nehru","Naveen"};

		print(names);

		String persons[][] = {{"Milan","B K Das","M"},{"Hitesh","Mohanty","M"},{"Moumita","Shaw","F"}};
		for(int i=0; i<persons.length; i++) {
			for(int j=0; j<persons[i].length; j++) {
				System.out.print(persons[i][j]+"  ");
			}
			System.out.println();
		}

		print2(persons);
	}

	public static void print(String[] x) {
		for(int i=0; i<x.length; i++) {
			System.out.println(x[i]);
		}
	}

	public static void print2(String[][] data) {
		for(int i=0; i<data.length; i++) {
			for(int j=0; j<data[i].length; j++) {
				System.out.print(data[i][j]+"  ");
			}
			System.out.println();
		}
	}
}