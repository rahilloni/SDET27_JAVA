package ArrayPractice2;

public class ReverseStringUsingToCharArray {
	
	public static void main(String[] args) {
		
		String s="Raheel";
		char[] arr = s.toCharArray();
		
		for(int i=arr.length-1 ;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}

}
