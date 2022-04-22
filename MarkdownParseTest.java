import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

import org.junit.Test;

public class MarkdownParseTest {

	@Test
	public void addition() {
		assertEquals(2, 1+1);
	}
	
	@Test
	public void testMarkdownFileOne() {
		ArrayList<String> toReturn = new ArrayList<>();
		toReturn.add("https://something.com");
		toReturn.add("some-thing.html");
		
		try {
			assertEquals(toReturn, MarkdownParse.getLinks(Files.readString(Path.of("/Users/dominicfeliton/Documents/GitHub/markdown-parser/test-file.md"))));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testMarkdownFileTwo() {
		ArrayList<String> toReturn = new ArrayList<>();
		toReturn.add("test.html");
		
		try {
			assertEquals(toReturn, MarkdownParse.getLinks(Files.readString(Path.of("/Users/dominicfeliton/Documents/GitHub/markdown-parser/test-file2.md"))));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testMarkdownFileThree() {
		ArrayList<String> toReturn = new ArrayList<>();
		toReturn.add("https://something.com");
		toReturn.add("some-thing.html");
		toReturn.add("testing.html");
		
		try {
			assertEquals(toReturn, MarkdownParse.getLinks(Files.readString(Path.of("/Users/dominicfeliton/Documents/GitHub/markdown-parser/test-file3.md"))));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testMarkDownDiffTestFile(){
		ArrayList<String> toReturn = new ArrayList<>();
		toReturn.add("LarrySchmit.html");
		toReturn.add("EldenRing.com");
		toReturn.add("ImSoTiredPleaseHelp.html");
		try{
			assertEquals(toReturn, MarkdownParse.getLinks(Files.readString(Path.of("/Users/linkh/OneDrive/Documents/GitHub/mark-down-parser 2.0/markdown-parser/different-test-file.md"))));
		} catch(IOException e){
			e.printStackTrace();
		}
	}
	
}
