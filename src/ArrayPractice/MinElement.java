package ArrayPractice;

public class MinElement {
	
	public static void main(String[] args) {
		int[]arr= {1,10,50,45,65};
		for(int i=0; i<arr.length;i++)
		{
			for(int j=i+1; j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		System.out.println(arr[i]);
		}
		System.out.println("==========");
		System.out.println(arr[0]);
	}

}
