import java.util.Scanner;

public class UnicodeCalculator {

	public static void main(String[] args) {
		
		String inputOne;
		String inputTwo;
		char wordOne[];
		char wordTwo[];
		int resultOne = 0;
		int resultTwo = 0;
		int absDifference = 0;
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Welcome to Unicode Calculator!\nPlease enter two words you want evaluated"); //greet user
		
		inputOne = scnr.next();                                    // user inputs two words
		inputTwo = scnr.next();
		
		wordOne = inputOne.toCharArray();                          //evaluating each character in the first word
		for(char letter:wordOne)
		{
			resultOne = resultOne + (int)letter;                    // unicode value for each char
			System.out.printf("%s-%d\n", letter, (int)letter); 		// printf to print the unicode value for each char
		}                                                     	    // concatenating would be too long
		
		
		wordTwo = inputTwo.toCharArray();                          // same process for the second word
		for(char letter:wordTwo)
		{
			resultTwo += (int)letter;
			System.out.printf("%s-%d\n", letter, (int)letter); 
		}
		
		
		if (resultOne > resultTwo)    {            //finding the absolute difference between the values of the two words
			absDifference = resultOne - resultTwo; 
		}
		else   {
			absDifference = resultTwo - resultOne;
		}
		
		System.out.println("The difference is: " + absDifference);
	}

}
