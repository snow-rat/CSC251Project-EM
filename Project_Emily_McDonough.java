import java.util.*;
import java.io.*;

public class Project_Emily_McDonough
{
	public static void main(String[] args) throws FileNotFoundException {		
		String provName = "PLACEHOLDER";
		String polNameFirst;
		String polNameLast;
		String polSmoke = "PLACEHOLDER";
		String polNumber;
      String blank = " ";
      
		double polAge = 0;
		double polHeight = 0;
      double polWeight = 0;
      double bmi = 0;
      double feeTotal = 0;
      
      int smokeNo = 0;
      int smokelessNo = 0;
      
      File polsrc = new File("PolicyInformation.txt");
      Scanner reader = new Scanner(polsrc);
      
      ArrayList<Policy> data = new ArrayList<Policy>();
      
//end of variables
      
      while(reader.hasNext()) {
		   polNumber = reader.nextLine();
         provName = reader.nextLine();
         polNameFirst = reader.nextLine();
         polNameLast = reader.nextLine();
         
         blank = reader.nextLine();
         polAge = Double.parseDouble(blank);
         
         polSmoke = reader.nextLine();
         
         blank = reader.nextLine();
         polHeight = Double.parseDouble(blank);
         
         blank = reader.nextLine();
         polWeight = Double.parseDouble(blank);
         
         if(reader.hasNext()) {
            reader.nextLine();
         }
         
         Policy pol = new Policy (polNumber, provName, polNameFirst, polNameLast, polAge, polSmoke, polHeight, polWeight);
         data.add(pol);
      }
      
      reader.close();
      
      for(int i =0; i < data.size(); i++) {
         System.out.println("Policy Number: " + data.get(i).getPolNumber());
         System.out.println("Provider Name: " + data.get(i).getProvName());
         System.out.println("Policyholder's First Name: " + data.get(i).getPolNameFirst());
         System.out.println("Policyholder's Last Name: " + data.get(i).getPolNameLast());
         System.out.println("Policyholder's Age: " + data.get(i).getPolAge());
         System.out.println("Policyholder's Smoking Status: " + data.get(i).getPolSmoke());
         if (polSmoke.equalsIgnoreCase("non-smoker")) {
            smokelessNo +=1;
         }
         else {
            smokeNo +=1;
         }
         System.out.println("Policyholder's Height: " + data.get(i).getPolHeight());
         System.out.println("Policyholder's Weight: " + data.get(i).getPolWeight());
         System.out.println("Policyholder's BMI: " + data.get(i).bmiCalc(polHeight, polWeight, bmi));
         System.out.println("Policy Price: " + data.get(i).feeCalc(polAge, polSmoke, bmi, feeTotal));
      }
      
      System.out.println("The number of policies with a smoker is " + smokeNo);
      System.out.println("The number of policies with a non-smoker is " + smokelessNo); 
// currently the smoker count and the displays for BMI and price are bugged. yet another thing i need to work on next time because i'm tired
	}
}