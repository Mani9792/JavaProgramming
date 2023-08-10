package com.programs_oops;

public class B_Employee_Main {

	public static void main(String[] args) {

		// By Reference;
		//System.out.println("---Variables assigned By Reference---");
		//Employee e1 = new Employee();
		//e1.eid = 101;
		//e1.ename="Mani";
		//e1.salary = 1000000.00;
		//e1.deptNo=006;
		//e1.job="Test Analyst";
		
		//e1.display();
		
		//Employee e2 = new Employee();
		//e2.eid = 102;
		//e2.ename="Mani SL";
		//e2.salary = 1000000.00;
		//e2.deptNo=007;
		//e2.job="SDET";
		
		//e2.display();
		
		//By Methods
		//System.out.println("---Variables assigned By Methods---");
		//Employee e3 = new Employee();
		
		//e3.getValues(103, "Manikandan", 1000000.00,8, "QA");
		
		//e3.display();
		
		//By Constructors
		A_Employee e4 = new A_Employee(104,"Manikandan SL",1000000.00,9,"QA AUTOMATION");
		
		e4.display();
		

	}

}
