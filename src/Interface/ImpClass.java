package Interface;

public class ImpClass{
	
	public static void main(String[] args) {
		
		Run obj=new Run() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("implementation for Run Interface");
				
			}
		};
		obj.run();
		
			
		}
		
	}

