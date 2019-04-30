package GroupA;

public class AlphabetNumber {

	public static void main(String[] args) {
		char[] alpha = {'0','a','b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        String aa = "tesA".toLowerCase();
        for (int i = 0; i <aa.length(); i++) {
		for (int j = 1; j < alpha.length; j++) {
			if (aa.charAt(i)==alpha[j]) {
				    System.out.print(j+" ");
			}
		}
	}
	
		/*
		String a ="Test".toLowerCase();
		for (int i = 0; i < a.length(); i++) {
			System.out.print((a.charAt(i)-96)+" ");
		}
		
		*/
		
	}

}
