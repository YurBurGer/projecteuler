package euler;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Yuriy Gerasimov
 *
 */
public class Problem08 {
	
	//methods
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s = sc.next();
		char[] c=s.toCharArray();
		int max=0;
		System.out.println(c.length);
		for(int i=0;i<=c.length-5;i++){
			int prod = 1;
			for(int j=0;j<5;j++){
				prod*=c[i+j]-'0';
			}
			max=Math.max(max, prod);
		}
		System.out.println(max);		
		sc.close();
	}

}
