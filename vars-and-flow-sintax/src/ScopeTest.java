
public class ScopeTest {
	public static void main(String[] args) {
		System.out.println("Testing Scopes");
		
		int age = 18;
		int peopleQuantity = 3;
		
		//boolean accompanied = peopleQuantity >= 2;
		boolean accompanied;
		
		if(peopleQuantity >= 2) {
			accompanied = true;
		}
		else {
			accompanied = false;
		}
		
		System.out.println("value of accompanied = "+ accompanied);
		if (age >= 18 && accompanied) {
			System.out.println("welcome");
		} else {
			System.out.println("unfortunately you cannot enter");
		}
	}
}
