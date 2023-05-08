package Allprograms;

public class SwitchFirstAndLastWord {
	
	public static void main(String[] args) {
		
		String s="Priya is dumb";
		
		String[] strArr = s.split(" ");
		
		for(int i=0;i<strArr.length;i++)
		{
			String temp=strArr[0];
			strArr[0]=strArr[strArr.length-1];
			strArr[strArr.length-1]=temp;
			System.out.print(strArr[i]+" ");
		}
	}

}
