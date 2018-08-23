import java.util.Scanner;


public class TempConverter {

	public static void main(String[] args) {
		
	String choice = "f";
	String entry;
	String temp;
		
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	
	System.out.println("If you would like to convert from F to C enter your query in the form ***F");
	System.out.println("where *** is the temperature you wish to convert");
	System.out.println("If you would like to convert from C to F enter your query in the form ***C");
	System.out.println("where *** is the temperature you wish to convert");
		
	entry = sc.next();
	choice = entry.substring(entry.length()-1);
	temp = entry.substring(0, entry.length()-1);
	
	//Verify the last char is either f or c
	if ((choice.equalsIgnoreCase("c")) || (choice.equalsIgnoreCase("f"))) {
		//Verify there is some entry before the f or c
		if (entry.length()>1) {
			//If last char is "c", perform conversion from C to F
			if (choice.equalsIgnoreCase("c")) {
				System.out.println(CtoF(temp));
			}
			//Else perform conversion from F to C
			else {
				System.out.println(FtoC(temp));
			}
		}
		else {
			System.out.println("You did not enter a numerical temperature");
		}
	}
	else {
		System.out.println("You did not enter your temperature in the required format");
	}
	}
	
	public static double FtoC (String choice) {
		Double num = 0.0;
		double calculation = 0;
		//If temperature is not in numerical form, throw exception
		try {
			num = Double.parseDouble(choice);
		}
		catch(NumberFormatException e) {
			System.out.println("You did not enter a numerical temperature");
			System.exit(1);
		}
		calculation = (5*(num-32))/9;
		return calculation;				
	}

	public static double CtoF (String choice) {
		Double num = 0.0;
		double calculation = 0.0;
		//If temperature is not in numerical form, throw exception
		try{
			num = Double.parseDouble(choice);
		}
		catch(NumberFormatException e){
			System.out.println("You did not enter a numerical temperature");
			System.exit(1);
		}
		calculation = (num*(9/5.0)+32);
		return calculation;
	}

}
