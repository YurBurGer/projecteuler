package euler;

public class Problem28 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		printspiral(makespiral(7));
		System.out.println(getsum(1001));
	}
	public static int getsum(int size){
		int sum=1;
		for(int i=1;i<=size/2;i++){
			int ru=(2*i+1)*(2*i+1),ld=(4*i*i+1);
			int lu=(ru+ld)/2;
			int rd=lu+ld-ru;
			sum+=ru;
			sum+=rd;
			sum+=lu;
			sum+=ld;
		}		
		return sum;
	}	
	public static int[][] makespiral(int size){
		int[][] a=new int[size][size];
		int x=0,y=size-1;
		int n=size*size;
		for(int i=0;i<size/2;i++){
			for(int j=0;j<size-2*i;j++){
				a[x][y]=n;
				n--;
				y--;
			}
			y++;
			for(int j=1;j<size-2*i;j++){
				x++;
				a[x][y]=n;
				n--;
			}			
			for(int j=1;j<size-2*i;j++){
				y++;
				a[x][y]=n;
				n--;
			}			
			for(int j=1;j<size-2*i-1;j++){
				x--;
				a[x][y]=n;
				n--;
			}
			y--;
		}
		a[size/2][size/2]=1;
		return a;
	}
	public static void printspiral(int[][] a){
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
