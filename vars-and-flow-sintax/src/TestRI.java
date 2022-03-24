
public class TestRI {
	public static void main(String[] args) {
		double salary = 4665.0;
		String ri;
		int deduction;
		
		if (salary >= 1900.0 && salary <= 2800.0) {
			ri = "7.5%";
			deduction = 142;
		}
		else if (salary > 2800.0 && salary <= 3751.0) {
			ri = "15%";
			deduction = 350;
		}
		else if (salary > 3751.0 && salary <= 4664.00) {
			ri = "22.5%";
			deduction = 636;
		}
		else {
			ri = "0%";
			deduction = 0;
		}
		
		System.out.println("Your RI is: " + ri 
				+ " and your Deduction is: " + deduction);
	}
}
