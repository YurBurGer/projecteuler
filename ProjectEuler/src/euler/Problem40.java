package euler;


/**
 * @author Yuriy Gerasimov
 *
 */
public class Problem40 {
	public static void main(String[] args){
		int len=0,n=0;
		int prod=1;
		int[] a={1,10,100,1000,10000,100000,1000000};
		for(Integer i=1;i<100000000;i++){
			len+=i.toString().length();
			if(len>=a[n]){
				int l=len,num=i;
				while(l!=a[n]){
					num/=10;
					l--;
				}
				prod*=(num%=10);
				System.out.println(i+" "+len+"--"+l+" "+num);
				n++;
				if(n>a.length-1)
					break;
			}
		}
		System.out.println(prod);
	}
	
}