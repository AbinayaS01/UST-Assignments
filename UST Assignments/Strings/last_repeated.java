package strings;

public class last_repeated {

	public static void main(String[] args) {
		  String str = "languagee";
	        char result = '\0';
	        for (int i = str.length() - 1; i >= 0; i--) {
	            char current = str.charAt(i);
	            if (str.indexOf(current) != str.lastIndexOf(current)) {
	                result = current; 
	                break;
	            }
	        }
	        if (result != '\0') {
	            System.out.println("First last repeating character: " + result);
	        } else {
	            System.out.println("No repeating character found.");
	        }

	}

}
