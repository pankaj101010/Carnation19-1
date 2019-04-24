package GroupA;

public class PatternUpadate {

	public static void main(String[] args) {

		int i = 3;
		char c ='a';
		int k =1;
		for (int j = 1; j <=i; j++) {
			for (int space = j; space <= i-1; space++) {
				System.out.print(" ");
			}
			if (j==1) {
				System.out.print(" *");
				System.out.println();
			}
			if (j==2) {
				for (int n=1; n <=i ; n++) {
					System.out.print(c+" ");
					c++;
				}
				System.out.println();
			}
				
				if (j==3) {
					for (int n=i; n >=0 ; n--) {
						System.out.print(k+" ");
						k++;
					}
				}
			}
		

	}

}
