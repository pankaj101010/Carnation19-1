package GroupA;
public class PatternUpdate {

	public static void main(String[] args) {
		int line = 7 ;
		char c = 'a';
		int num =1;
		for (int i = 1; i <=line; i++) {
			for (int j = i; j <=line-1; j++) {
				System.out.print(" ");
				//System.out.println(i%3);
			}
			for (int j = 1; j <=i; j++) {
				if (i%3==1) {
					System.out.print(" * ");
					
				}
				else if(i%3==2){
					System.out.print( " "+c+" ");
					c++;
				}
				else {
					System.out.print(" "+num+" ");
					num++;
				}
			}
			System.out.println();

		}

	}

}
