package newJavaPrograms;

public class OccuranceOfaLetterInAstring {
	
	public static void main(String[] args) {
		String s="Raaheel";
		for(int i=0; i<s.length();i++)
		{
			char ch=s.charAt(i);
			int count=1;
			for(int j=i+1; j<s.length(); j++)
			{
				if(ch==s.charAt(j))
				{
					count++;
					break;
					
				}
			}
			System.out.println(s.charAt(i)+""+count);
		}
	}

}
