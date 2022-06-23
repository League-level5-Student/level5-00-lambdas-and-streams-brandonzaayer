package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s)->{
			String backwards = "";
			for(int i = s.length()-1; i >= 0; i--) {
				backwards += s.charAt(i);
			}
			System.out.println(backwards);
		}, "Forwards");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s)->{
			String fun = "";
			for(int i = 0; i <  s.length(); i++) {
				if(i%2==0) {
					fun += s.toUpperCase().charAt(i);
				}
				else{
					fun += s.toLowerCase().charAt(i); 
				}
			}
			System.out.println(fun);
		}, "UpandDown");
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s)->{
			String dotty = "";
			for(int i = 0; i <  s.length(); i++) {
				dotty += s.charAt(i) + ".";
			}
			System.out.println(dotty);
		}, "period");
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((s)->{
			String vwls = "";
			for(int i = 0; i < s.length(); i++) {
				if(s.toLowerCase().charAt(i) == 'a' || s.toLowerCase().charAt(i) == 'e' || s.toLowerCase().charAt(i) == 'i' || s.toLowerCase().charAt(i) == 'o' || s.toLowerCase().charAt(i) == 'u' || s.toLowerCase().charAt(i) == 'y') {
					vwls += "";
				}
				else{
					vwls += s.charAt(i); 
				}
			}
			System.out.println(vwls);
		}, "Alphabet");
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
