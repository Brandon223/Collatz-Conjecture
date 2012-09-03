package collatz;
import java.util.Scanner;

public class Collatz_Conjecture {
		public static void main(String[] args){
		int x = 0; //user input number to run through the Collatz Conjecture
		int y = 0; //number of iterations until we kill our loop
		int count = 0; //counts actual number of iterations within our loop
		
		Scanner inp = new Scanner(System.in);
		boolean x_Positive = false; // if(x > 1), set to TRUE
		boolean y_Positive = false; // if(z > 0), set to TRUE
		
		while (x_Positive == false){
			System.out.println("Enter your starting Integer: ");
			x = inp.nextInt();
			
			//sets our bool to TRUE if greater than 1
			if(x > 1){
				x_Positive = true;
			}
			
			else{
				System.out.println("Please enter an integer greater than 1!");
			}
			
			while (y_Positive == false){
				System.out.println("How many iterations do you want the application to run?");
				y = inp.nextInt();
				
				//changes bool val to TRUE if greater than 0
				if (y > 0){
					y_Positive = true;
				}
				
				else{
					System.out.println("Please enter a positive integer!");
				}
				
				while (y > 0){
					if(x == 1){
						break; //loop ends if n == 1
					}
					
					else if(x%2 == 1){
						x = 3 * x + 1;
						count = count + 1; //count var increases by one (logs interations)
					}
					
					else if(x%2 == 0){
						x = x / 2;
						count = count +1; //count var increases by one (logs interations)
					}
					
					y = y - 1;
					System.out.println("The final outcome is " + x + ", after running for " + count + " iterations.");  
				}
			}
		}
	}
}
