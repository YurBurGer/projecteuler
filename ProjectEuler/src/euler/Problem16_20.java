package euler;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Yuriy Gerasimov
 *also solves problem20
 */
public class Problem16_20 {

	//methods
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s= sc.next();
		char[] c=s.toCharArray();
		long sum=0;
		for(int i=0;i<c.length;i++)
			sum+=(c[i]-'0');
		System.out.print(sum);
		sc.close();
	}

}
