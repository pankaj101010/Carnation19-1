package GroupA;

public class StringSpaceRemove {

	public static void main(String[] args) {
		String a = "p    a     n   k   a  j";
		String [] ab =a.split("\\s");
	 for (int i = 0; i < ab.length; i++) {
		System.out.print(ab[i]);
	} 
	 System.out.println();
	 System.out.print(a.replace(" ", ""));

	}

}
