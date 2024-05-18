package sampletest1;

import org.testng.annotations.Test;

public class sampleOrgTest {
	
	@Test
	public void Test1() {
		String url = System.getProperty("url");
		String username = System.getProperty("username");
		String password = System.getProperty("password");
		
		System.out.println(url);
		System.out.println(username);
		System.out.println(username);
		
	}
	
	@Test
	public void test2() {
		System.out.println("exicute Test 2");
	}
}
