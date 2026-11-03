public class Policy
{
public double bmiCalc(double polHeight, double polWeight, double bmi){
   bmi = (polWeight * 703) / (polHeight * polHeight);
   System.out.format("%.2f", bmi);
   return bmi;
    }
public double feeCalc(double polAge, int polSmoke, double bmi, double feeTotal){
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

   if (polSmoke == 1) {
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