package test;
//whats your menu for today
import java.util.Scanner;//import scanner
class Foodtype {
	void veg() {//method
		System.out.println("your today food is aalu briyani and chili paneer");
		System.out.println("thank you");
	}
	void nonveg() {//method
		System.out.println("your today food is motton briyani and chiken chap");
		System.out.println("thank you");
	}
}
public class Todaymenu{//main class
	public static void main(String[] args) {//main method
		Scanner Sc=new Scanner(System.in);//creating scanner object
		String s1="veg";//declearing string s1
		String s2="nonveg";//declearing string s1
		Foodtype f=new Foodtype();//object of foodtype
		System.out.println("enter your name");
		String N=Sc.nextLine();//user name
		System.out.println("enter your mobile number");
	long num=Sc.nextLong();//user mobile number
		System.out.println("you want veg or non veg?");
		String F=Sc.next();//food type
	if(F.equals(s1)) {//checking veg or not
		System.out.println("hello "+N);
		System.out.println("your mobile no is "+num);
		f.veg();//method calling
		}
	else if(F.equals(s2)) {//checking veg or not
		System.out.println("hello "+N);
		System.out.println("your mobile no is "+num);
		f.nonveg();//checking veg or not
	}else {
		System.out.println("you have selected wrong food type");
	}}}