package GroupA;

public class NewTraingleDigit {

	public static void main(String[] args) {
		int line = 9;
		for (int i = 0; i <= line; i++) {
			for (int space = line; space >=i; space--) {
				System.out.print(" ");
			}
//			if (i == 0) {
//				System.out.print(0);
//			} else {
				for (int j = i; j >= 0; j--) {
					System.out.print(j);
				}
				for (int j = 1; j <= i; j++) {
					System.out.print(j);
				}
			//}
			System.out.println();
		}
	}
}
