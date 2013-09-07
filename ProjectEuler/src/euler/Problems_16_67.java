package euler;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problems_16_67 {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc=new Scanner(new FileInputStream("18_67.txt"));
		int n=sc.nextInt();
		int[][] t=new int[n][n];
		t[0][0]=sc.nextInt();
		for(int i=1;i<n;i++){
			int val=sc.nextInt();
			t[i][0]=t[i-1][0]+val;
			for(int k=1;k<=i-1;k++){
				val=sc.nextInt();
				t[i][k]=Math.max(t[i-1][k-1],t[i-1][k])+val;
			}
			val=sc.nextInt();
			t[i][i]=t[i-1][i-1]+val;
		}
		int max = 0;
		for(int i=0;i<t[n-1].length;i++)
			max=Math.max(max, t[n-1][i]);
		System.out.println(max);
		sc.close();
	}

}
