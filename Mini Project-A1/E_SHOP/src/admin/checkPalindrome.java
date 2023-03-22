package admin;

public class checkPalindrome {
	//check if palindrome or not? 
	
	
	
	
	
	
	public static void main(String[] args) {
		
		String s= "pushkar";
		
		int count=0;
		
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)==s.charAt(s.length()-(i+1))){
		
				count++;
			}
			
		}
		
		
		if(count==s.length()) {
		System.out.println("It is palindrome");
}
		else {
			System.out.println("It is not Palindrome");
		}
		
	}
	
}
