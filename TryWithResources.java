import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
	
	
	public static void main(String[] a) {
		
		try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\chandrakant\\Desktop\\operationalDetailList.txt"))){
			
			
			String line = br.readLine();
			StringBuilder sb = new StringBuilder();
			
			while(line!=null)
			{
				sb.append(line);
				sb.append(System.lineSeparator());
				line = br.readLine();
			}
			
			System.out.println(sb.toString());
			
			
		} 
		
catch (IOException e) {
			
	System.out.println(e);
		}
		
		
	}	
		/* catch (IOException e) {

				System.out.println(e);
				e.printStackTrace();
			}*/
		
		/*finally {
			
			try {
			 
				if(br!=null)
				br.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}*/
		
		
		
		
		
		
		
	}
	
	

