package com.cg.mathproject.test;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.cg.mathproject.exceptions.InValidNoRangeException;
import com.cg.mathproject.services.MathServices;
import com.cg.mathproject.services.MathServicesImpl;
public class MathServicesTest {
	private static MathServices services;
	private int validNum1,validNum2,inValidNum1,inValidNum2,expectedAns;
	@BeforeClass
	public static void setUpTestEnv() {
		services=new MathServicesImpl();
	}
	@AfterClass
	public static void tearDownTestEnv()  {
		services=null;
	}
	@Before
	public void setUpMockData() {
		validNum1=10;
		validNum2=20;
		inValidNum1=-10;
		inValidNum2=-20;
	}
	@Test(expected=InValidNoRangeException.class)
	public void testAddForFirstInvalidNo() throws InValidNoRangeException{
		services.add(inValidNum1, validNum2);
	}
	@Test(expected=InValidNoRangeException.class)
	public void testAddForSecondInvalidNo() throws InValidNoRangeException{
		services.add(validNum1, inValidNum2);
	}
	@Test
	public void testAddValidNo() throws InValidNoRangeException{
		//		services.add(validNum1, validNum2);
		Assert.assertEquals(30, services.add(validNum1, validNum2));
	}
	@Test(expected=InValidNoRangeException.class)
	public void testSubForFirstInvalidNo() throws InValidNoRangeException{
		services.sub(inValidNum1, validNum2);
	}
	@Test(expected=InValidNoRangeException.class)
	public void testSubForSecondInvalidNo() throws InValidNoRangeException{
		services.sub(validNum1, inValidNum2);
	}
	@Test
	public void testSubValidNo() throws InValidNoRangeException{
		Assert.assertEquals(-10, services.sub(validNum1, validNum2));
	}
	@Test(expected=InValidNoRangeException.class)
	public void testDivForFirstInvalidNo() throws InValidNoRangeException{
		services.div(inValidNum1, validNum2);
	}
	@Test(expected=InValidNoRangeException.class)
	public void testDivForSecondInvalidNo() throws InValidNoRangeException{
		services.div(validNum1, inValidNum2);
	}
	@Test
	public void testDivValidNo() throws InValidNoRangeException{
		Assert.assertEquals(0, services.div(validNum1, validNum2));
	}
	@After
	public void tearDown() throws Exception {
		validNum1=10;
		validNum2=20;
		inValidNum1=-10;
		inValidNum2=-20;
		expectedAns=0;
	}
}
