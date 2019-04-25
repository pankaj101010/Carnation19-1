package GroupA;

public class pattern{
	public static void main(String[] args) {
		/**
		 *    O/p expected       * 
		 *                     a b c
		 *                    1 2 3 4         
		 */
		int i = 3;
		char c ='a';
		int k =1;
		// this For used for line 
		for (int j = 1; j <=i; j++) {
			// This is used for spaces 
			for (int space = j; space <= i-1; space++) {
				System.out.print(" ");
			}
			// this if is used to print first line
			if (j==1) {
				System.out.print(" *");
				System.out.println();
			}
			//this if is used to print second line
			if (j==2) {
				for (int n=1; n <=i ; n++) {
					System.out.print(c+" ");
					c++;
				}
				System.out.println();
			}
			// this if is used to print third line
				if (j==3) {
					for (int n=i; n >=0 ; n--) {
						System.out.print(k+" ");
						k++;
					}
				}
			}
		}
		
	
}
