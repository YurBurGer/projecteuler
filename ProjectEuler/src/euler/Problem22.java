package euler;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Collections;
import java.util.LinkedList;

public class Problem22 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		StreamTokenizer str=new StreamTokenizer(new InputStreamReader(new FileInputStream("22.txt")));
		str.quoteChar('"');
		str.whitespaceChars(',',',');
		str.nextToken();
		LinkedList<Pair> names=new LinkedList<>();
		while(str.ttype!=StreamTokenizer.TT_EOF){
			names.add(new Pair(str.sval));
			str.nextToken();
		}
		Collections.sort(names);
		long res=0;
		long k=1;
		for(Pair i:names){
			res+=i.val*k;
			k++;			
		}
		System.out.println(res);
	}

}
class Pair implements Comparable<Pair>{
	String name;
	Long val;
	/**
	 * @param name
	 * @param val
	 */
	public Pair(String name) {
		this.name = name;
		val=(long) 0;
		for(int i=0;i<name.length();i++)
			val+=(name.charAt(i)-'A'+1);
	}
	public int compareTo(Pair o) {
		if(name.compareTo(o.name)!=0)
			return name.compareTo(o.name);
		else 
			return val.compareTo(o.val);
	}	
	
}
