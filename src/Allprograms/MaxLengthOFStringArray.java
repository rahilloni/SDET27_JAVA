package Allprograms;

public class MaxLengthOFStringArray {

	
	public static void main(String[] args) {
		
		String[] strArr= {"a", "adghjazc", "ahhddadadw", "adadad"};
		String maxelement = strArr[0];
		
		
		for(int i=0;i<strArr.length;i++)
		{
			if(maxelement.length()<strArr[i].length())
			{
				maxelement=strArr[i];
			}
		}
		System.out.println(maxelement);
	}
}
