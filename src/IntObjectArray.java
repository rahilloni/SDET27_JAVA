
public class IntObjectArray {
	
	public static void main(String[] args) {
		int[][]obj={{1,2,3},{4,5,6},{7,8,9}};     
		int sum=0;
		for(int i=0; i<obj.length;i++)
		{
			int b[]=obj[i];
			int count=b.length;
			for(int j=0; j<b.length;j++)
			{
				if(j==count) {
					sum=sum+b[i];
					count++;
					break;
				}
			}
		}
		
		
		System.out.println(sum);
	}

}
//673
//793
//082
