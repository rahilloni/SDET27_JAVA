package Allprograms;

public class CountOfVowelsInName {
	
	public static void main(String[] args) {
		
		String s="Raheel";
		String name = s.toLowerCase();
		int count = 0;
		for(int j=0;j<s.length();j++)
		{
			if(name.charAt(j)=='a'||name.charAt(j)=='e'||name.charAt(j)=='i'||name.charAt(j)=='o'||name.charAt(j)=='u')
			{
				count++;
			}
		}
		System.out.println(count);
		
	}

}


