package Assignment3;

public class Question6 {

	public static void main(String [] args) {
		
		/*
		 * Question-6

Scientists estimate that roughly 10 grams of caffeine consumed at one time is a lethal overdose.

Write a program with a variable that holds the number of milligrams of caffeine in a drink
 and outputs how many drinks it takes to kill a person.

       Sample Output

      Number of milligrams in drink: 500
      It would take about 20 drinks for a lethal overdose
		 */
	
	
		int miligrams = 653;  
        final int deadlyDose = 10000; 
        int cupsForOverdose = deadlyDose / miligrams;

        System.out.println("Number of milligrams in drink: " + miligrams);
        System.out.println("It would take about " + cupsForOverdose + " drinks for a lethal dose");
		
        
        
	}
	
	
	}
