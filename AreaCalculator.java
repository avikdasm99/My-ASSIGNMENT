package com.cognizant.shapes;

class Rectangle{
	void calculatearea() {
		System.out.println("The area of the rectangle calculate using the formmula length * bredth");
	}
}

public class AreaCalculator {  

	public static void main(String[] args) {
		
		Rectangle obj=new Rectangle();
				obj.calculatearea();
	}

}
