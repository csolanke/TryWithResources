
public class ThrowsDemo {
	
	public static void isValid(int i) throws MyException  {
		if(i<10)
			throw new MyException("not a valid number");
		
	}

	
	public static void main(String[] args)  {
		
		try {
			isValid(8);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		System.out.println("testing completed");
		
		
		
	}
	
	
}
