package com.innovation.shapes;
public class Circle {                                   
	private float radius;
	static float pi=3.5f;
	 public Circle(){                                                             //Constructor 1
			radius=1.5f;
	}
	Circle(float radius){                                            //Constructor 2
		this(10.5f,3.4f);
		this. radius=radius;
	}
	Circle(float radius, float pi){                                       //Constructor 3
		this. radius=radius;
	}
	static void calculateCircleArea(float radius) {               // method 1
		float area=pi*radius*radius;
		System.out.println("area ="+area);
	}
	static void calculateCirclecircumferance(float radius) {               // method 2
		float circumferance=2*pi*radius;
		System.out.println("circumferance="+circumferance);
	}                              
	public static void main(String[] args) {   //main method
		Circle obj1=new Circle();
		Circle obj2=new Circle(4.5f);
		obj1.calculateCircleArea(4.5f);
		obj2.calculateCircleArea(4f);	
	}
  }
