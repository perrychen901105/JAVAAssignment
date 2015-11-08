package SectionOne;

import java.util.Scanner;

public class AssignOne {
	
	
	private Scanner scanner;

	public Double getDegreeValue() {
		scanner = new Scanner(System.in);
		double fdegree = scanner.nextDouble();
		double degree = (5.0 / 9.0) * (fdegree - 32);
		return degree;
	}
}
