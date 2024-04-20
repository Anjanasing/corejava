package com.crac;

public class RightTringle {
	
	public static void main(String[] args) {
		int row=5;
		for(int i=0;i<row;i++) {
			for(int j=4;j>=i;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}


