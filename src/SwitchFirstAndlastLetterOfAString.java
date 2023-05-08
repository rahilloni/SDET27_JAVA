
public class SwitchFirstAndlastLetterOfAString {
	
	public static void main(String[] args) {
		
		String str="Raheel";

        int length = str.length();
        char first = str.charAt(0);
        char last = str.charAt(length - 1);
        String middle = str.substring(1, length - 1);

        String result = last + middle + first;
        System.out.println("Result: " + result);
			
			

		
	}

}
