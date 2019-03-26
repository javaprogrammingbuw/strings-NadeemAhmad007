import java.util.Scanner;

//advanced

		
		//todo: take as an input a combination of characters and numbers (e.g. 2a3b5c)
		//expand the String by printing each letter so many times as the number before the letter indicates
		//e.g. 2a3b5c -> aabbbccccc
		//Hint: first start with inputs where there is always a number and then a character, then think about how
		//to improve your code such that you can use values greater or equal 10, eg. 10a13b22c
		//Further modification: if a character should only be printed one time you don't need to write any number infront of that character
		//e.g. a3b12cd5e -> abbbccccccccccccdeeeee  
		
public class Expand {



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Code indendation!

		  Scanner ss = new Scanner(System.in);
		    System.out.print("Enter the your string : ");
		    // Below Statement used for getting String including sentence
		    String s = ss.nextLine(); 
		   // Below Statement used for return the first word in the sentence
		  System.out.println("name "+s);

		  	//This should have been done in a method!

		    StringBuilder sb = new StringBuilder();
		    int repeat = 0;
		    for (char c : s.toCharArray()) {
		        if (Character.isDigit(c)) {
		            repeat = repeat * 10 + Character.getNumericValue(c);
		        } else {
		            while (repeat > 0) {
		                sb.append(c);
		                repeat--;
		            }
		            sb.append(c);
		        }
		    }
		    System.out.println( sb.toString());
		}
		  
}
