package SectionOne;

import java.math.BigDecimal;
import java.util.Scanner;

public class AssignFour {
	private Scanner scan = null;
	
	public void getAllNums() {
		this.scan = new Scanner(System.in);
		String douSum = this.scan.next();
		BigDecimal bigDecimal = new BigDecimal(douSum);
		Integer intFiveYuan = bigDecimal.divide(new BigDecimal(5)).intValue();
		BigDecimal douRemain = bigDecimal.remainder(new BigDecimal(5));
		Integer intYiYuan = douRemain.divide(new BigDecimal(1)).intValue();
		douRemain = douRemain.remainder(new BigDecimal(1));
		Integer intYiJiao = douRemain.divide(new BigDecimal("0.1")).intValue();
		douRemain = douRemain.remainder(new BigDecimal("0.1"));
		Integer intFiveFen = douRemain.divide(new BigDecimal("0.05")).intValue();
		
		douRemain = douRemain.remainder(new BigDecimal("0.05")); //Math.ceil(douRemain % 0.05);
		
		Integer intYiFen = douRemain.divide(new BigDecimal(0.01)).intValue();
		System.out.println("Five:" + intFiveYuan + "Yi Yuan:" + intYiYuan + "Yi jiao:" + intYiJiao + "Five Fen:" + intFiveFen + "Yi Fen:" + intYiFen);
	}
}
