package day05_operators;

public class SalaryCalculator {

    public static void main(String[] args) {

        double hourlyRate = 55,
                weeklyHours = 45;
        double stateTaxRate = 7;    //inplicit casting
        double federalTaxRate = 24.5;
        //____________________________________
        double salaryBeforeTax = hourlyRate*weeklyHours*52;
        double stateTax = salaryBeforeTax*stateTaxRate/100;
        double faderalTax = salaryBeforeTax*federalTaxRate/100;
        double totalTax = stateTax + faderalTax;
        double SalaryAfterTax = salaryBeforeTax - totalTax;

        System.out.println("Gross pay is: $" + salaryBeforeTax);
        System.out.println("Federal Tax is: $" + faderalTax);
        System.out.println("State tax is: $" + stateTax);
        System.out.println("Total tax is: $" + totalTax);
        System.out.println("Net income is: $" + SalaryAfterTax);

        System.out.println("______________________________________");

        System.out.println("Gross pay is: $\" + salaryBeforeTax +" +
                          "\nFederal Tax is: $" + faderalTax +
                          "\nState tax is: $" + stateTax +
                          "\nTotal tax is: $" + totalTax +
                          "\nNet income is: $" + SalaryAfterTax);


    }

}
/*1.1declare the following variables:
					hourlyRate, weeklyHours, stateTaxRate, federalTaxRate

			1.2 use the given info in above variables to calculate the followings:
					1. salaryBeforeTax
					2. stateTax
					3. federalTax
					4. totalTax
					5. salaryAfterTax
				Hint: salaryBeforeTax = hourlyRate * weeklyHour * 52

			1.3 use print statement to print each of the above
					Ex:	   hourlyRate = $50
						   weeklyHours = 45
						   stateTaxRate = 6 (given as percentage, you need to convert to decimal)
						   federalTaxRate = 26 (given as percentage, you need to convert to decimal)

					    output:
					    	Gross pay is: $117000
					    	Federal tax is: $30420
				    		State tax is: $7020
				    		Total tax is: $37440
				    		Net income is: 79560

 */