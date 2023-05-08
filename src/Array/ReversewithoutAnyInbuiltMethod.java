package Array;

public class ReversewithoutAnyInbuiltMethod {
	
	public static void main(String[] args) {
		String s="Luxury";
		System.out.println(s);
		char[] arr = s.toCharArray();
		int count=0;
		for(char newarr:arr)
		{
			count++;
		}
		for(int i=count-1;i>=0;i--) {
			System.out.print(arr[i]);
		}
//to find length  we can use s.length() or use foreach to get the length of the array
	}


}
