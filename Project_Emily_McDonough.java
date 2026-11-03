import java.util.Scanner;

public class Project_Emily_McDonough
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String provName = "PLACEHOLDER";
		String polNameFirst;
		String polNameLast;
		
		int polNumber;
		int polSmoke;
		
		double polHeight;
		double polWeight;
      
      double polAge;
      double bmi = 0;
      double feeTotal = 0;
		
// due to time constraints, i've implemented the smoking check as an integer instead of a string. i'll probably fix that later on
		
		Policy insr = new Policy();
		
		System.out.println("Please enter the Policy Number: ");
		polNumber = scan.nextInt();
      
		System.out.println("Please enter the Provider Name: ");
// also due to time constraints (i was very busy this week) i could not work out this bug where it just skips letting you enter this part
      provName = scan.nextLine();
      
      System.out.println("Please enter the Policyholder's First Name: ");
      polNameFirst = scan.nextLine();
      
      System.out.println("Please enter the Policyholder's Last Name: ");
      polNameLast = scan.nextLine();
      
      System.out.println("Please enter the Policyholder's Age: ");
      polAge = scan.nextDouble();
      
      System.out.println("Please enter 0 if the Policyholder is a non-smoker, or 1 if the Policyholder is a smoker: ");
      polSmoke = scan.nextInt();
      
      System.out.println("Please enter the Policyholder's Height (in inches): ");
      polHeight = scan.nextDouble();
      
      System.out.println("Please enter the Policyholder's Weight (in pounds): ");
      polWeight = scan.nextDouble();
      
      bmi = insr.bmiCalc(polHeight, polWeight, bmi);
      
      feeTotal = insr.feeCalc(polAge, polSmoke, bmi, feeTotal);
      
      System.out.println("Policy Number: " + polNumber);
      System.out.println("Provider Name: " + provName);
      System.out.println("Policyholder's First Name: " + polNameFirst);
      System.out.println("Policyholder's Last Name: " + polNameLast);
      System.out.println("Policyholder's Age: " + polAge);
      
      System.out.println("Policyholder's Smoking Status: " + polSmoke);
      System.out.println("Policyholder's Height: " + polHeight);
      System.out.println("Policyholder's Weight: " + polWeight);
      System.out.println("Policyholder's BMI: " + bmi );
      System.out.println("Policy Price: " + feeTotal);
      
	}
}