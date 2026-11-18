public class Policy
{

//fields
   private String provName, polNumber, polNameFirst, polNameLast, polSmoke;
   private double polAge, polHeight, polWeight;
   
   public Policy(String pNo, String prName, String pNameF, String pNameL, double pAge, String pSmoke, double pHeight, double pWeight) {
      polNumber = pNo;
      provName = prName;
      polNameFirst = pNameF;
      polNameLast = pNameL;
      polAge = pAge;
      polSmoke = pSmoke;
      polHeight = pHeight;
      polWeight = pWeight;
   }

// setters
   public void setPolNumber(String polNumber) {
      polNumber = pNo;
   }
   public void setProvName(String provName) {
      provName = prName;
   }
   public void setPolNameFirst(String polNameFirst) {
      polNameFirst = pNameF;
   }
   public void setPolNameLast(String polNameLast) {
      polNameLast = pNameL;
   }
   public void setPolAge(double polAge) {
      polAge = pAge;
   }
   public void setPolAge(String polSmoke) {
      polSmoke = pSmoke;
   }
   public void setPolAge(double polHeight) {
      polHeight = pHeight;
   }
   public void setPolAge(double polWeight) {
      polWeight = pWeight;
   }

// getters
   public String getPolNumber() {
      return polNumber;
   }
   public String getProvName() {
      return provName;
   }
   public String getPolNameFirst() {
      return polNameFirst;
   }
   public String getPolNameLast() {
      return polNameLast;
   }
   public double getPolAge() {
      return polAge;
   }
   public String getPolSmoke() {
      return polSmoke;
   }
   public double getPolHeight() {
      return polHeight;
   }
   public double getPolWeight() {
      return polWeight;
   }
   

// calculates bmi using height and weight
   public double bmiCalc(double polHeight, double polWeight, double bmi){
      bmi = (polWeight * 703) / (polHeight * polHeight);
      System.out.format("%.2f", bmi);
      return bmi;
    }
    
// calculates additional fees for old age, smoking, and high bmi
   public double feeCalc(double polAge, String polSmoke, double bmi, double feeTotal){
      double baseFee = 600;
      double ageFee;
      double smokeFee;
      double bmiFee;
   
      if (polAge > 50) {
         ageFee = 75;
      }
      else {
         ageFee = 0;
      }

      if (polSmoke.equalsIgnoreCase("smoker")) {
         smokeFee = 100;
      }
      else {
         smokeFee = 0;
      }
   
      if (bmi > 35) {
         bmiFee = (bmi - 35) * 20;
      }
      else {
         bmiFee = 0;
      }
   
      feeTotal = baseFee + ageFee + smokeFee + bmiFee;
      System.out.format("%.2f", feeTotal);
      return feeTotal;
   }

}