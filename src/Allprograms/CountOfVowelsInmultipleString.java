package Allprograms;

public class CountOfVowelsInmultipleString {
	
	public static void main(String[] args) {
		
		String[]strArr= {"Raaheel","Priya","Aleena"};
		
		for(int i=0; i<strArr.length;i++)
		{
			String s=strArr[i];
			String name = s.toLowerCase();
			
			int count=0;
			for(int j=0; j<s.length();j++)
			{
				if(name.charAt(j)=='a'||name.charAt(j)=='e'||name.charAt(j)=='i'||name.charAt(j)=='o'||name.charAt(j)=='u')
				{
					count++;
				}
			}
			System.out.println(name+"=="+count);
		}
	}
	

}
