package lambdaExample;

public class CalculatorApp {
      public void getAmount(IntrestCalculator ic){
    	  System.out.println("Simple Intrest :"+ic.simpleIntrest(3000,2,6));
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    CalculatorApp ca=new CalculatorApp();
    ca.getAmount((p, r, t)-> p*r*t/100);

}
}
