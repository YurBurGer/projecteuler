package euler;

import java.io.FileInputStream;
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
			t.add(i*(i+1)/2);
		}
		StreamTokenizer str=new StreamTokenizer(new InputStreamReader(new FileInputStream("42.txt")));
		str.quoteChar('"');
		str.whitespaceChars(',',',');
		str.nextToken();
		int c=0;
		while(str.ttype!=StreamTokenizer.TT_EOF){
			char[] s=str.sval.toCharArray();
			Integer sum=0;
			for(char c1:s){
				sum+=(c1-'A'+1);
			}
			if(t.contains(sum)) 
				c++;
			str.nextToken();
		}
		System.out.println(c);
	}

}
