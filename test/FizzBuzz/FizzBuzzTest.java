package FizzBuzz;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

//	@BeforeClass
//	public static void setUpBeforeClass() throws Exception {
//		System.out.println("setUpBeforeClass");
//	}
//
//	@AfterClass
//	public static void tearDownAfterClass() throws Exception {
//		System.out.println("tearDownAfterClass");
//	}
//
//	@Before
//	public void setUp() throws Exception {
//		System.out.println("setUp");
//	}
//
//	@After
//	public void tearDown() throws Exception {
//		System.out.println("tearDown");
//	}

	@Test
	public void FizzBuzz_Fizz() {
		assertEquals("Fizz", Count100.FizzBuzz("3"));
		System.out.println("Fizz");
	}

	@Test
	public void FizzBuzz_Buzz() {
		assertEquals("Buzz", Count100.FizzBuzz("5"));
		System.out.println("Buzz");
	}

	@Test
	public void FizzBuzz_FizzBuzz() {
		assertEquals("FizzBuzz", Count100.FizzBuzz("15"));
		System.out.println("FizzBuzz");
	}

	@Test
	public void テスト内容は日本語のメソッドで説明() {
		assertEquals("1", Count100.FizzBuzz("1"));
		System.out.println("1");
	}

	@Test
	public void FizzBuzz_Other_02() {
		assertEquals("error", Count100.FizzBuzz("aaaa"));
		System.out.println("error");
	}

	@Test
	public void FizzBuzz0_Other_03() {
		assertEquals("error", Count100.FizzBuzz(null));
		System.out.println("error");
	}

	@Test
	public void FizzBuzz_Other_04() {
		assertEquals("error", Count100.FizzBuzz(""));
		System.out.println("error");
	}

}
