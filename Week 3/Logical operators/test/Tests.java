import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;

public class Tests {
	
	@Test
	public void testSolution() {
		assertEquals("4, 6, musically", "Enter the " +
				"first " +
				"number: \n" +
				"Enter the second number: \n" +
				"Both numbers are positive!\n" +
				"A or B is 4!\n" +
				"Enter a word: \n" +
				"Your word is an adverb!".replaceAll("\\r\\n?", "\n").trim(), testCase("4\n6\nmusically\n").trim().replaceAll("\\r\\n?", "\n"));
		
		assertEquals("-2, 6, musically", "Enter " +
				"the first number: \n" +
				"Enter the second number: \n" +
				"Enter a word: \n" +
				"Your word is an adverb!".replaceAll("\\r\\n?", "\n").trim(), testCase("-2\n6\nmusically\n").trim().replaceAll("\\r\\n?", "\n"));
		
		assertEquals("-2, 4, musically", "Enter " +
				"the first number: \n" +
				"Enter the second number: \n" +
				"A or B is 4!\n" +
				"Enter a word: \n" +
				"Your word is an adverb!".replaceAll("\\r\\n?", "\n").trim(), testCase("-2\n4\nmusically\n").trim().replaceAll("\\r\\n?", "\n"));
		
		assertEquals("-2, 4, music",
				testCase("-2\n4\nmusic\n").trim().replaceAll("\\r\\n?", "\n"),
				"Enter the first " +
						"number:" +
						" \n" +
						"Enter the second number: \n" +
						"A or B is 4!\n" +
						"Enter a word: \n" +
						"Your word is not an adverb!".replaceAll("\\r\\n?", "\n").trim());
		
		assertEquals("8, 4, music", "Enter the first " +
				"number: \n" +
				"Enter the second number: \n" +
				"Both numbers are positive!\n" +
				"A or B is 4!\n" +
				"Enter a word: \n" +
				"Your word is not an adverb!".replaceAll("\\r\\n?", "\n").trim(), testCase("8\n4\nmusic\n").trim().replaceAll("\\r\\n?", "\n"));
		
		assertEquals("4, 4, music", "Enter the " +
				"first number: \n" +
				"Enter the second number: \n" +
				"Both numbers are positive!\n" +
				"A or B is 4!\n" +
				"Enter a word: \n" +
				"Your word is not an adverb!".replaceAll("\\r\\n?", "\n").trim(), testCase("4\n4\nmusic\n").trim().replaceAll("\\r\\n?", "\n"));
		
		assertEquals("4, 4, definitely", "Enter the" +
				" " +
				"first " +
				"number: " +
				"\n" +
				"Enter the second number: \n" +
				"Both numbers are positive!\n" +
				"A or B is 4!\n" +
				"Enter a word: \n" +
				"Your word is an adverb!".replaceAll("\\r\\n?", "\n").trim(), testCase("4\n4\ndefinitely\n").trim().replaceAll("\\r\\n?", "\n"));
		
		assertEquals("0, 0, definitely", "Enter " +
				"the first number: \n" +
				"Enter the second number: \n" +
				"Enter a word: \n" +
				"Your word is an adverb!".replaceAll("\\r\\n?", "\n").trim(), testCase("0\n0\ndefinitely\n").trim().replaceAll("\\r\\n?", "\n"));
	}
	
	private String testCase(String input) {
		System.setIn(new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8)));
		final ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		Task.main(new String[]{});
		return out.toString();
	}
}