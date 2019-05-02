import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestException {
	
	public static void main(String[] args) throws NumberFormatException, IOException{
		
		int i,k;
		
		i=10;
		
		
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		int q = Integer.parseInt(bufferedReader.readLine());
		k=i/q;
		
		try {
		
		if(k > 10) {
			
		throw new MyException("Error in calculation sum should not be greater than 10");
		
		}
		}
		
		catch(MyException e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("Bye");
		
		
	}
	
}
