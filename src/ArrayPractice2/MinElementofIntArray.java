package ArrayPractice2;

public class MinElementofIntArray {
	
	public static void main(String[] args) {
		
		int[]arr= {5,10,1,97,12,8};
		for(int i=0; i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(arr[0]);
	}

}
