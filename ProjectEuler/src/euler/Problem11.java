package euler;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Yuriy Gerasimov
 *
 */
public class Problem11 {

	//methods
	public static void main(String[] args) {
		int[][] grid = new int[26][26];
		Scanner sc=new Scanner(System.in);
		int max=0;
		for(int i=3;i<23;i++){
			for(int j=0;j<3;j++){
				grid[i][j]=0;
				grid[i][25-j]=0;
			}
			for(int j=3;j<23;j++){
				grid[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<3;i++){
			for(int j=0;j<26;j++){
				grid[i][j]=0;
				grid[25-i][j]=0;
			}
		}
		for(int i=0;i<26;i++){
			for(int j=0;j<26;j++)
				System.out.print(grid[i][j]+" ");
			System.out.println();
		}
		for(int i=3;i<23;i++)
			for(int j=3;j<23;j++){
				int prodl=1;
				int prodlu=1;
				int produ=1;
				int prodru=1;
				int prodr=1;
				int prodrd=1;
				int prodd=1;
				int prodld=1;
				for(int k=0;k<4;k++){
					prodl*=grid[i][j-k];
					prodlu*=grid[i-k][j-k];
					produ*=grid[i-k][j];
					prodru*=grid[i-k][j+k];;
					prodr*=grid[i][j+k];
					prodrd*=grid[i+k][j+k];
					prodd*=grid[i+k][j];
					prodld*=grid[i+k][j-k];
				}
				max=Math.max(max, prodl);
				max=Math.max(max, prodlu);
				max=Math.max(max, produ);
				max=Math.max(max, prodru);
				max=Math.max(max, prodr);
				max=Math.max(max, prodrd);
				max=Math.max(max, prodrd);
				max=Math.max(max, prodld);
				max=Math.max(max, prodd);
			}
		System.out.println(max);
		sc.close();
	}

}
