package ArrayPractice2;

public class ReverseEveryWordOfAString {
	
	public static void main(String[] args) {
		
		String str="No way home";
		String[] strArr = str.split(" ");
		
		for(int i=0; i<strArr.length;i++)
		{
			String s=strArr[i];
			for(int j=s.length()-1; j>=0;j--)
			{
				System.out.print(s.charAt(j));
			}
		System.out.print(" ");
		}
	}

}
