package chapter3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileExample {

	public String processFile() throws IOException {
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader("data.txt"))) {
			return bufferedReader.readLine();
		}
	}
	
	public String processFile(BufferedReaderProcess p) throws IOException {
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader("data.txt"))) {
			return p.process(bufferedReader);
		}
	}
}
