package ArrayPractice;

public class demo {
	
	public static void main(String[] args) {
		String s="Raheel is a good guy";
		String[] str = s.split(" ");
		for(int i=0;i<str.length;i++)
		{
			String word=str[i];
			for(int j=word.length()-1;j>=0;j--)
			{
				System.out.print(word.charAt(j));
			}
		System.out.print(" ");
		}
	}

}
