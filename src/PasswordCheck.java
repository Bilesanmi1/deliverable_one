import java.util.Scanner;



public class PasswordCheck {
	public static void main(String[] args) {	
		// variables for password
		String password;
		
		// Scanner class object to obtain user input
		Scanner input = new Scanner(System.in);
	    //password directions for user to create password
		System.out.println("Create a password that has the folowing:\n At least one lowercase letter\n At least one uppercase letter\n At least minimun 7 characters\n At least maximum 12 characters\n An exclamation point !");
		password = input.nextLine();
		
		// 
		if(passwordcheck(password)) {
			System.out.println("Password valid and accepted");
		}else {
			System.out.println("Error");
		}
		
		
		
	
		
		
		
		
	}
	public static boolean passwordcheck(String password) {
				// list of characters and special character !
				char[] upperCaseLetters = {'A','B' , 'C', 'D', 'E', 'F', 'G', 'H', 'I',
											'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
											'S', 'T', 'U', 'V', 'W', 'X', 'Y','Z',};
			    char specialCharacter = '!';
				char[] lowerCaseLetters = {'a','b' , 'c', 'd', 'e', 'f', 'g', 'h', 'i',
						'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
						's', 't', 'u', 'v', 'w', 'x', 'y','z'};
				
				
				
				// variables for password
				int maxCharacters = 12;
				int minCharacters = 7;
				
				// booleans to check if password is valid
				boolean valid = false;
				boolean lowerCase = false;
				boolean upperCase = false;
				boolean maxChar = false;
				boolean minChar = false;
				boolean exclamationPoint = false;
				
				// check for minimum length
				if(password.length() >= minCharacters) {
					minChar = true;
				}// check for max length
				if(password.length() <= maxCharacters) {
					maxChar = true;
				}
				
				//check for upper case character
				for(int i = 0; i < password.length(); i++) {
					char ch = password.charAt(i);
					if(upperCase) {
						break;
					}
							for(int n = 0; n < upperCaseLetters.length; n++) {
								if(ch == upperCaseLetters[n]) {
									upperCase = true;
									break;
								}
							}
				}
				
				//check for lower case character
				for(int i = 0; i < password.length(); i++) {
					char ch = password.charAt(i);
					if(lowerCase) {
						break;
					}
							for(int n = 0; n < lowerCaseLetters.length; n++) {
								if(ch == lowerCaseLetters[n]) {
									lowerCase = true;
									break;
								}
							}
				}
				
				//check for exclamation point 
				for(int i = 0; i < password.length(); i++) {
					char ch = password.charAt(i);
					if(ch == specialCharacter) {
						exclamationPoint = true;
						
					}
					
				}
				
				// sets valid to true if all boolean variables are true
				if(upperCase && lowerCase && minChar && maxChar && exclamationPoint) {
					valid = true;
							
				}
				//returns valid boolean
				return valid;
						
				
			
		
	} 

}
