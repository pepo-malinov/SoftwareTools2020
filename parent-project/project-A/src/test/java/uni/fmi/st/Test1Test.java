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

}
