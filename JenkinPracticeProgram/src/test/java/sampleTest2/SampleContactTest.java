package sampleTest2;

import org.testng.annotations.Test;

public class SampleContactTest {
	
	@Test (groups="smoketesting")
	public void test1() {
		System.out.println("exicute contact test1");
	}
	
	@Test
	public void test2() {
		System.out.println("exicute contact test2");
	}
}
