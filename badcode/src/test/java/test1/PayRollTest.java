package test1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PayRollTest
{
	//1 = salary, 2 = hourly, 3 = contractor

	/*
	 * this tests the ability to add employees (E) to the payroll (P)
	 * 
	 * each employee type is determined by an integer attribute passed in the constructor
	 * 		1 = salary, 2 = hourly, 3 = contractor
	 * 
	 * the employees are then added to the payroll with method D
	 * 
	 * this is tested to make sure they are added in the expected order
	 */
	@Test
	void testAdd()
	{
		P payroll = new P();
		E con = new E("T", 30, 40, 3);
		E salary_employee = new E("TK",30000, 40, 1);
		E hourly_employee = new E("K", 20, 30, 2);
		payroll.D(con);
		payroll.D(salary_employee);
		payroll.D(hourly_employee);
		ArrayList<E> employeelist = payroll.EL;
		assertArrayEquals(new E[] {con,salary_employee, hourly_employee}, employeelist.toArray());
	}

	//eliminated child classes in the name of horrid code
//	@Test
//	void testHourlyEmployee()
//	{
//		HourlyEmployee hourly_emp = new HourlyEmployee("T", 20, 40);
//		assertEquals(hourly_emp.getPay() , 800);
//		hourly_emp.setHoursWorked(60);
//		assertEquals(hourly_emp.getPay() , 2800);
//	}
//	
//	@Test
//	void testSalaryEmployee()
//	{
//		SalaryEmployee salary_employee = new SalaryEmployee("S", 4000);
//		assertEquals(salary_employee.getPay() , 160000);
//		
//	}
//	
//	@Test
//	void testContractor()
//	{
//		Contractor con = new Contractor("W", 30, 35);
//		assertEquals(con.getPay() , 1050);
//		 
//	}
	
	/*
	 * this tests the pay method(p) in the payroll (P)
	 * 
	 * new employees are made using the constructor in E
	 *  	1 = salary, 2 = hourly, 3 = contractor
	 *  
	 * they are paid at the appropriate rate with the method p in P
	 * we make sure this matches the expected pays
	 */
	@Test
	void testPay() { 
		P payroll = new P();
		E hourly_emp = new E("P", 10, 20, 2);
		E salary_employee = new E("H", 50, 40, 1);
		E con = new E("W", 25, 30, 3);
		
		payroll.D(hourly_emp);
		payroll.D(salary_employee);
		payroll.D(con);
		
		float[] pays = {200, 1600, 750};
		
		assertArrayEquals(payroll.p(), pays);
	}
}
