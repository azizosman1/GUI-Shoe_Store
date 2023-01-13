public class Totals 
{
	//global variables 
	double total, subTotal, amount;
	final double TAX = 1.07;
	int quantity = 0;

	//method for total, sets total and subTotal to 0
	public Totals()
	{
		total = 0;
		subTotal = 0;
	}
	
	//method that calculates subTotal and TAX, rounds it up and returns the final total 
	public double calcTotal()
	{
		total += subTotal * TAX;
		total = Math.round(total); 
		return total; 
	}
	
	//method that grabs the subTotal and returns the final subTotals
	public double getsubTotal()
	{
		return subTotal;
	}
	
	//method  that grabs the TAX and returns final TAX
	public double getTAX()
	{
		return TAX;
	}
	
	// the value of amount = the subTotal, then adds subTotal with amount (amount is shoeCost)
	public void updatesubTotal(double amount)
	{
		subTotal += amount;
	}
	
	//toString method that returns final subTotal after each shoe is bought
	public String toString()
	{
		return  " \nThe subtotal is: " + getsubTotal();
		
	}

}