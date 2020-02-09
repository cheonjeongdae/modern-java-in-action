package chapter3;

import java.io.BufferedReader;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class FileExampleTest {

	@Test
	void test() throws Exception {
		FileExample fileExample = new FileExample();
		
		String oneLine = fileExample.processFile( (BufferedReader bufferedReader) -> bufferedReader.readLine());
		
	}

}
