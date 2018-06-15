package com.cg.payroll.test;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.cg.payroll.bean.Associate;
import com.cg.payroll.bean.BankDetails;
import com.cg.payroll.bean.Salary;
import com.cg.payroll.daoservices.PayrollDAOServicesImpl;
import com.cg.payroll.exceptions.AssociateDetailsNotFoundException;
import com.cg.payroll.exceptions.PayrollServicesDownException;
import com.cg.payroll.services.PayrollServices;
import com.cg.payroll.services.PayrollServicesImpl;
import com.cg.payroll.utilities.PayrollUtility;
public class PayrollServicesTest {
	private static PayrollServices payrollServices;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		payrollServices=new PayrollServicesImpl();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		payrollServices=null;
	}
	@Before
	public void setUp() throws Exception {
		Associate associate1=new Associate(111, 15000, "shravan", "kumar", "training", "analyst", "IASJKJSA","shravan@gmail.com", new Salary(10000, 500, 500),new BankDetails(1054051, "citi", "citi0002"));
		Associate associate2=new Associate(112, 12000, "rohit", "kumar", "training", "analyst", "IASJKSAA","rohit@gmail.com", new Salary(20000, 500, 500),new BankDetails(21290123, "citi", "citi02202"));
		PayrollDAOServicesImpl.associates.put(PayrollUtility.ASSOCIATE_ID_COUNTER++, associate1);
		PayrollDAOServicesImpl.associates.put(PayrollUtility.ASSOCIATE_ID_COUNTER++, associate2);
	}
	@After
	public void tearDown() throws Exception {
		PayrollDAOServicesImpl.associates.clear();
		PayrollUtility.ASSOCIATE_ID_COUNTER=111;
	}
	@Test 
	public void testAcceptAssociateDetailsForValidDate() throws PayrollServicesDownException{
		int expectedId=113;
		int actualId=payrollServices.acceptAssociateDetails("chitraksh", "s", "chitraksh@gmail.com", "training", "hr", "IHASJSA", 13000, 9000, 500, 500, 1546416, "sbi", "sbin003");
		Assert.assertEquals(expectedId, actualId);
	}
	@Test(expected=AssociateDetailsNotFoundException.class)
	public void testAcceptAssociateDetailsForInvaildData() throws PayrollServicesDownException,AssociateDetailsNotFoundException{
		payrollServices.getAssociateDetails(101);
	}
	@Test
	public void testCalculateNetSalaryForValidData()throws PayrollServicesDownException,AssociateDetailsNotFoundException{
		float expectedSal=(float)26616.666;
		float actualSal=payrollServices.calculateNetSalary(111);
		Assert.assertEquals(expectedSal, actualSal, 0.005);
	}
	@Test(expected=AssociateDetailsNotFoundException.class)
	public void testCalculateNetSalaryForInvalidData() throws AssociateDetailsNotFoundException,PayrollServicesDownException{
		payrollServices.calculateNetSalary(1111);
	}
	@Test(expected=AssociateDetailsNotFoundException.class)
	public void testGetAssociateDetailsForInvalidData()throws AssociateDetailsNotFoundException,PayrollServicesDownException{
		payrollServices.getAssociateDetails(110);
	}
	@Test
	public void testGetAssociateDetailsForValidData()throws AssociateDetailsNotFoundException,PayrollServicesDownException{
		Associate expectedAssociate=new Associate(111, 15000, "shravan", "kumar", "training", "analyst", "IASJKJSA","shravan@gmail.com", new Salary(10000, 500, 500),new BankDetails(1054051, "citi", "citi0002"));
		Associate actualAssociate=payrollServices.getAssociateDetails(111);
		Assert.assertEquals(expectedAssociate, actualAssociate);
	}
}
