import java.util.LinkedHashSet;

public class StringArrayRepeatedChar {
	
	public static void main(String[] args) {
		
		String str="Hi I am Raaheel and I am not a good guy";
		String[] arr = str.split(" ");
		
		for(int i=0; i<str.length(); i++)
		{
			String s=arr[i];
			LinkedHashSet<Character> h=new LinkedHashSet<Character>();
			for(int j=0;j<s.length();j++) {
				h.add(s.charAt(j));
			}

			for(Character ch:h)
			{
				int count=0;
				for(int k=0;k<s.length();k++) {
					if(ch==s.charAt(i)) {
						count++;
					}
				}
				if(count>1) {
					System.out.println(ch+"="+count);
					
				}
			}
			
		}
	}

}
