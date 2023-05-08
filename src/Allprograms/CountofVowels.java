package Allprograms;

public class CountofVowels {
	
	public static void main(String[] args) {
		
		String[] strArr= {"mrudala","chat","Zoom"};
		for(int i=0; i<strArr.length;i++)
		{
			String s = strArr[i];

			int count = 0;
			for(int j=0; j<s.length();j++)
			{
				if(s.charAt(j)=='a' ||s.charAt(j)=='e' ||s.charAt(j)=='i' ||s.charAt(j)=='o' ||s.charAt(j)=='u')
				{
					count++;
					
				}

			}
			System.out.println(strArr[i]+"=="+count);
		}
	}

}
