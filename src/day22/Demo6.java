package day22;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Demo6 {
	public static void main(String[] args) throws IOException {
		File file = new File("E:\\Code\\Java\\Eclipse4.3\\Itcast\\src\\day22\\Demo5.java");
		FileReader fileReader = new FileReader(file);
		BufferedLineNum bufferedLineNum = new BufferedLineNum(fileReader);
		String line = null;
		while ((line=bufferedLineNum.readLine()) != null) {
			System.out.println(line);
		}
		bufferedLineNum.close();
	}
}

class BufferedLineNum extends BufferedReader {

	int count = 1;
	
	public BufferedLineNum(Reader in) {
		super(in);
	}
	
	@Override
	public String readLine() throws IOException {
		String line = super.readLine();
		if (line == null) {
			return null;
		}
		line = count + " " + line;
		count++;
		return line;
	}
}