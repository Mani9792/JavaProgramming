package com.programs_oops;

public class A_Employee {

	//By Reference
	int eid;
	String ename;
    double salary;
    int deptNo;
    String job;
    
    //By Methods
    void getValues(int m_id, String m_name, double m_salary, int m_deptNo, String m_job)
    {
    	eid = m_id;
    	ename = m_name;
    	salary = m_salary;
    	deptNo = m_deptNo;
    	job = m_job;
    	
    } 
    
    //By Constructors
    A_Employee(int c_id, String c_name, double c_salary, int c_deptNo, String c_job)
    {
    	eid = c_id;
    	ename = c_name;
    	salary = c_salary;
    	deptNo = c_deptNo;
    	job = c_job;    	
    }
    
    
    void display()
    {
    	System.out.println(eid);
    	System.out.println(ename);
    	System.out.println(salary);
    	System.out.println(deptNo);
    	System.out.println(job);
    }

}
