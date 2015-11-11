package SectionOne;

public class AssignSix {
	public void getNewNum() {
		Double douPIE = 0.0;
		int i = 1;
		do {
			douPIE = (1.0 / (2 * i - 1)) * 4;
			i++;
		} while (douPIE >= 3.14159);
		System.out.println("the i is " + i);
	}
}
