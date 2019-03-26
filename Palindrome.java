

	//todo: Create a method isPalindrome which takes a String as input and returns true if it is a palindrome and false otherwise.
	//A palindrome is a word which can be read backwards and forwards in the same way., e.g. 'hannah'.
	//Ignore upper and lower case. 'Hannah' is a palindrome, too.
	//Ignore also spaces. 'Taco cat' is a valid palindrome.

import java.util.Scanner;

//Does not compile
public class isPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ss = new Scanner(System.in);
	    System.out.print("Enter the your String : ");
	   
	    String s = ss.nextLine(); 
	   char[] w = s.toCharArray();
	    s= s.replaceAll("\\s+", "");
	    s = s.toLowerCase();
	  
	   boolean r = isPalindrom(s);
	   System.out.println(r);
	  
	 
		}
	public static boolean isPalindrom(String s){
	    int i1 = 0;
	    int i2 = s.length() - 1;
	    while (i2 > i1) {
	        if (s.charAt(i1) != s.charAt(i2)) {
	            return false;
	        }
	        ++i1;
	        --i2;
	    }
	    return true;
	}
	
}
