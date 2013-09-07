package euler;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.TreeSet;

public class Problem42 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		TreeSet<Integer> t=new TreeSet<>();
		for(int i=1;i<100;i++){
			t.add(i*(i+1));
		}
		StreamTokenizer str=new StreamTokenizer(new InputStreamReader(new FileInputStream("42.txt")));
		str.quoteChar('"');
		str.whitespaceChars(',',',');
		str.nextToken();
	}

}
