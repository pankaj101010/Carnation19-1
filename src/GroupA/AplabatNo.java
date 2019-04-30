package GroupA;

public class AplabatNo {
public static void main(String[] args) {
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
}
}
