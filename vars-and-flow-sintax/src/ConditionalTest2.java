
public class ConditionalTest2 {
	public static void main(String[] args) {
		System.out.println("Testing Conditionals 2");
		int age = 18;
		int peopleQuantity = 3;
		boolean accompanied = peopleQuantity >= 2;
		
		System.out.println("value of accompanied = "+ accompanied);
		if (age >= 18 && accompanied) {
			System.out.println("welcome");
		} else {
			System.out.println("unfortunately you cannot enter");
		}
	}
}
