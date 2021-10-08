import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

import static org.junit.Assert.assertEquals;

public class Tests {
	
	@Test
	public void testSolution() {
		testCase("50\n1.81", "Underweight\n", "Weight = 50, Height = 1.81");
		testCase("70\n1.69", "Healthy\n", "Weight = 70, Height = 1.69");
		testCase("100\n1.85", "Overweight\n", "Weight = 100, Height = 1.85");
		testCase("110\n1.60", "Obese\n", "Weight = 110, Height = 1.60");
	}
	
	private void testCase(String input, String expected, String description) {
		System.setIn(new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8)));
		final ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		Task.main(new String[]{});
		final String[] split = out.toString().toLowerCase(Locale.ROOT).split("\\s+");
		assertEquals(description,
				expected.trim().toLowerCase(Locale.ROOT),
				split[split.length - 1].trim().toLowerCase(Locale.ROOT));
	}
}