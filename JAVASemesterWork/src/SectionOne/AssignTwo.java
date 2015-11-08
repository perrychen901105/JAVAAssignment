package SectionOne;

import java.util.Scanner;

public class AssignTwo {
	private Scanner myScan;
	
	public double getArea() {
		System.out.println("input radius:");
		myScan = new Scanner(System.in);
		double radius = myScan.nextDouble();
		
		double area = radius * radius * Math.PI;
		System.out.println("area is " + area);
		return area;
	}
	
	public double getVolume() {
		double area = this.getArea();
		System.out.println("input height");
		myScan = new Scanner(System.in);
		double height = myScan.nextDouble();
		double volume = area * height;
		System.out.println("volume is " + volume);
		return volume;
	}
}
