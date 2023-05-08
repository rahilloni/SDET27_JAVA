package Array2;

public class SwapFirstAndLastWordofString {
	
	public static void main(String[] args) {
		
		String s="Priya is Dumb";
		String[] str=s.split(" ");
		
		
		for(int i=0; i<str.length; i++)
		{
			String temp=str[0];
			str[0]=str[str.length-1];
			str[str.length-1]=temp;
			System.out.print(str[i]+" ");
		}
	}

}
