
public class ThrowExplicitlyAnException {

	static void isValidAge(int age)
	{
		if(age < 18)
			throw new ArithmeticException("Not a valid age to vote");
		else {
			
			System.out.println("Welcome to Vote");
		}
			
		
	}
	
	
	public static void main(String[] args) {
		
		
		isValidAge(Integer.parseInt(args[0]));
		
		
	}
	
	
	
	
	
}
