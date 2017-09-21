import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import pkgBase.MyInteger;

public class MyIntegerTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testisEven() {
		
		
		MyInteger n = new MyInteger(2);
		assertTrue(n.isEven());
	}
	
	@Test
	public void testisOdd() {
		
		MyInteger n = new MyInteger(1);
		assertTrue(n.isOdd());
	}
	
	@Test
	public void testisPrime() {
		
		MyInteger n = new MyInteger(5);
		MyInteger i = new MyInteger(14);
		assertTrue(n.isPrime());
		assertTrue(!i.isPrime());
		
	}
	
	@Test
	public void testisEvenint() {
		
		MyInteger n = new MyInteger(1);
		assertTrue(n.isEven(2));
	}
	
	@Test
	public void testisOddint() {
		
		MyInteger n = new MyInteger(2);
		assertTrue(n.isOdd(1));
	}
	
	@Test
	public void testisPrimeint() {
		
		MyInteger n = new MyInteger(4);
		assertTrue(n.isPrime(5));
	}
	
	@Test
	public void testisEvenMyInteger() {
		
		MyInteger n = new MyInteger(2);
		assertTrue(n.isEven(n));
		
	}
	
	@Test
	public void testisOddMyInteger() {
		
		MyInteger n = new MyInteger(1);
		assertTrue(n.isOdd(n));
		
	}

	
	@Test
	public void testisPrimeMyInteger() {
		
		MyInteger n = new MyInteger(5);
		assertTrue(n.isPrime(n));
		
	}
	
	@Test
	public void testEqualsInt() {
		
		MyInteger n = new MyInteger(4);
		assertTrue(n.equals(4));
	}
	
	@Test
	public void testEqualsMyInteger() {
		
		MyInteger n = new MyInteger(4);
		MyInteger i = new MyInteger(4);
		assertTrue(n.equals(i));
	}
	
	
}
