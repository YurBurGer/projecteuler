package euler;

import java.util.Arrays;

public class Problem24 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a={0,1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(a));
		for(int k=1;k<1000000;k++){
			int p1=a.length-2;
			while((p1>=0)&&!(a[p1]<a[p1+1]))
				p1--;
			int p2=p1+1;
			int minp2=a[p2];
			for(int i=p1+1;i<a.length;i++){
				if((a[p1]<a[i])&&(a[i]<minp2)){
					p2=i;
					minp2=a[i];
				}
			}
			int t=a[p1];
			a[p1]=a[p2];
			a[p2]=t;
			a=reversepart(a,p1);			
		}
		System.out.println(Arrays.toString(a));
	}
	public static int[] reversepart(int[] a,int first){
		for(int i=1;i<=(a.length-first)/2;i++){
			int t=a[first+i];
			a[first+i]=a[a.length-i];
			a[a.length-i]=t;
		}
		return a;
	}
}
