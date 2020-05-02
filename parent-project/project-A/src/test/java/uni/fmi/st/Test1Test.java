/**
 * 
 */
package uni.fmi.st;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * 
 * @author pepo
 *
 */
public class Test1Test {

	@Test
	public void test1() {
		final Test1 test1 = new Test1();
		assertEquals(10, test1.sum(4, 6));
	}
	
	@Test
	public void test2() {
		final Test1 test1 = new Test1();
		assertEquals("15", test1.sum(10, 5));
	}

}
