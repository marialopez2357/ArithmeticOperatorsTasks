package Assignment3;

public class Question7 {

	public static void main(String[] args) {
		
		
		/*Question-7

		Write a program that determines the change to be dispensed from a vending machine.
		 An item in the machine can cost between 25 cents and 1 dollar, in 5-cent increments
		  (25, 30, 35, . . . , 90, 95, or 100), and the machine accepts only a single dollar
		   bill to pay for the item.

		      Sample output

		      Price in cents : 95

		      Your change is 0 quarters, 0 dimes, and 1 
	*/
		
		
	        int price, change, quarter, dime, nickle;
	        price=95;
	        change=100-price;
	        quarter=change/25;
	        dime=(change-(quarter*25))/10;
	        nickle=(change-(quarter*25)-(dime*10))/5;
	        
	        System.out.println("Your change is "+quarter+" quarters, "+dime+" dimes, and "+nickle+" nickles");
	    }
		
		
	}


