package SectionOne;

import java.util.Scanner;

public class AssignThree {
	private Scanner scan = null;
	
	public void calculateNum() {
		System.out.println("please input num:");
		
		this.scan = new Scanner(System.in);
		Integer intInput = this.scan.nextInt();
		Integer intThousand = intInput / 1000;
		Integer intHundred = (intInput / 100) % 10;
		Integer intTen = (intInput / 10) % 10;
		Integer intNum = intInput % 10;
		Integer intSum = intThousand + intHundred + intTen + intNum;
		System.out.println("the integer is " + intSum);
	}
	
}
