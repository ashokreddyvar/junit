package Log4j_2.junit;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class Employee {
	@Test
	
	public void testEmploy() {
		System.out.println(" ashok reddy -1");
		
	}
	@Test
	
	public void testSave() {
		System.out.println(" ashok reddy -2");
		
	}
	@Test
	
	public void test() {
		System.out.println(" ashok reddy -3");
		
	}
	@BeforeAll
	public void employee() {
		System.out.println(" ashok reddy ");
	}
	@Test
	public void testEmployee() {
		System.out.println(" ashok reddy  employee");
	}
	@Test
	public void testEmp() {
		System.out.println(" employee");
		
	}

}
