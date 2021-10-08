import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;

public class Tests {
	
	@Test
	public void testSolution() {
		// Check 5
		System.setIn(new ByteArrayInputStream("5".getBytes(StandardCharsets.UTF_8)));
		final ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		Task.main(new String[]{});
		assertEquals("Your program should say the number is less than or equal to 5.", ("Your number is less than or " +
				"equal to 5!").trim(), out.toString().trim());
		
		// Check 7
		System.setIn(new ByteArrayInputStream("7".getBytes(StandardCharsets.UTF_8)));
		final ByteArrayOutputStream out2 = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out2));
		Task.main(new String[]{});
		assertEquals("Your program should say the number is larger than 5.", "Your number is larger than 5!".trim(),
				out2.toString().trim());
	}
}