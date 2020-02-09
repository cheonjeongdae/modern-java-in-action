package chapter3;

import java.io.BufferedReader;
import java.io.IOException;

@FunctionalInterface
public interface BufferedReaderProcess {

	String process(BufferedReader bufferedReader) throws IOException;
	
}
