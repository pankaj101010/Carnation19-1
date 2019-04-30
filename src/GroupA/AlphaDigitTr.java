package GroupA;

public class AlphaDigitTr {

	public static void main(String[] args) {
		int line = 8 ;
		char val = 'a';
		for (int i = 1; i <=line; i++) {
//			for (int j = i; j <line; j++) {
//				System.out.print(" ");
//			}
			if (i%2==0) {
				int x=1;
				for (int k = i; k >=1; k--) {
					System.out.print(x+" ");
					x++;
				}
			}
			else {
				for (int m = i; m >=1; m--) {
					System.out.print(val+" ");
				}
				val+=2;
			}
			
			System.out.println();
			
			
			
		}

		/*
		  int line =5;
	for(int i=1;i<=line;i++)
	{
		for (int j = i; j <line; j++) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{
			if(i%2!=0)
			{
				System.out.print(((char)(i+96))+" ");
			}
			else
			{
				System.out.print(i+" ");
			}
		}
		System.out.println();

	}  
		 */
		
		
		
		
		
	}

}
