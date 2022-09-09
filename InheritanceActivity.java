package a9;
class Employee{
	 long employeeId;
	 String employeename ;
	 String employeeaddress ;
	 Long employeephone ;
	 double basicSalary ;
	double specialallowance = 250.80;
	double hra=1000.50;
	
	public Employee(long Id,String name,String address,long phone){
		employeeId=Id;
		employeename=name;
		employeeaddress=address;
		employeephone=phone;
	}
	void calculateSalary() {
		double salary = basicSalary + ( basicSalary * specialallowance/100) + ( basicSalary *hra/100);
				System.out.println("salary of"+employeename+"  is" +salary);
	}
	 void calculateTransportAllowance() {
		 double transportAllowance = 10/100*basicSalary;
		 System.out.println(" transportAllowance of  "+employeename+"  is"+transportAllowance);
	 }
}

class Manager extends Employee{
	
	public Manager(long Id, String name, String address, long phone,double salary) {
		super(Id, name, address, phone);
		basicSalary=salary;
	}	
	 void calculateTransportAllowance() {
		double transportAllowance = 15*basicSalary /100;
		 System.out.println(" transportAllowance ="+transportAllowance);
	}
}

class Trainee extends Employee{

	Trainee(long Id, String name, String address, long phone,double salary) {
		super(Id, name, address, phone);
		basicSalary=salary;
	}
	 void calculateTransportAllowance() {
		double transportAllowance = 10*basicSalary /100;
		 System.out.println(" transportAllowance ="+transportAllowance);
	}
}


public class InheritanceActivity {

	public static void main(String[] args) {
		System.out.println("Manager");
		Manager m=new Manager(126534,"Peter","Chennai India",237844,65000);
		m.calculateSalary();
		m.calculateTransportAllowance();
		
		System.out.println("Trainee");
		Trainee t=new Trainee(29846,"Jack","Mumbai India",442085,45000);
		t.calculateSalary();
		t.calculateTransportAllowance();
	}
}


