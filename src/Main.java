
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int residuo;
		
		for (int i = 1; i <= 100; i++) {
			residuo = i%3;
			int residuoCinco = i%5;
			if(residuo==0)
			{
			
				System.out.print("fizz");
				
			}
			if (residuoCinco==0) {
			
				System.out.print("buzz");
				
			}
			else if(residuo!=0 && residuoCinco !=0) {
				System.out.print(i);

			}

			System.out.println("");
			
		}
		
	}

}
