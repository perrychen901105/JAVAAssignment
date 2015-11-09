package SectionOne;

public class AssignFive {
	public void getNum() {
		Integer num = 0;
		Integer i = 0;
		do {
			num = i*i;
			i++;
		} while (num <= 12000);
		System.out.println("the i is " + i);
	}
}
