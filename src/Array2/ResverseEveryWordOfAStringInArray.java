package Array2;

public class ResverseEveryWordOfAStringInArray {
	
	public static void main(String[] args) {
		
		String str="No Way Home";
		String[] strArr = str.split(" ");   //converting to string array
		
		for(int i=0; i<strArr.length;i++)
		{
			String s=strArr[i]; //assigning the first element to the variable s
			for(int j=s.length()-1; j>=0; j--)
			{
				System.out.print(s.charAt(j));
			}
		System.out.print(" ");
		}
	}

}
