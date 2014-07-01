package sample;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HelloTest {

	@Test
	public void test() {
		assertEquals(new Hello().getHello(), "<h1>Hello World!</h1>");
	}

}
