package Array2;

public class MinLengthOfStringArray {
	
	public static void main(String[] args) {
		
		String[]str= {"apple","orange","banana","kiwi","polo"};
		String minElement=str[0];
		
		for (int i = 1; i < str.length; i++) {
			if(minElement.length()>str[i].length())
			{
				minElement=str[i];
			}
			
		}
//		System.out.println(minElement);
		
		for (int i = 0; i < str.length; i++) {
			if(minElement.length()==str[i].length())
			{
				System.out.println(str[i]);
			}
			
		}
	}

}
