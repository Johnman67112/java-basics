
public class ConditionalTest {
	public static void main(String[] args) {
		System.out.println("Testing Conditionals");
		int age = 18;
		int peopleQuantity = 1;

		if (age >= 18) {
			System.out.println("you are older than 18");
			System.out.println("welcome");
		}
		else {
			if (peopleQuantity >= 2) {
				System.out.println("you are not 18, but you can enter,"
						+ "because you are accompanied");
			}
			else {
				System.out.println("unfortunately you cannot enter");
			}
		}
	}
}
