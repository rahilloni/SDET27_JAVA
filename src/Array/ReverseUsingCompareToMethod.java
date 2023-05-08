package Array;

public class ReverseUsingCompareToMethod {
	
	public static void main(String[] args) {
		String s="Priya";
		String s1="";
		int count = s.compareTo(s1);
		System.out.println(count);
		char[] arr = s.toCharArray();
		for(int i=count-1;i>=0;i--) {
			System.out.print(arr[i]);
		}
	}
}
