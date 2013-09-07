package euler;
import java.util.TreeSet;

public class Problem58 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeSet<Integer> t=primes.Primes.PrimeSet(10000000);
		//System.out.print(t.toString());
		int n=1;
		Integer[] num=new Integer[4];
		num[0]=(2*n+1)*(2*n+1);
		num[1]=(4*n*n+1);
		num[2]=(num[0]+num[1])/2;
		num[3]=num[1]+num[2]-num[0];
		double count=5;
		int primes=0;
		for(int i=1;i<4;i++){
			if(t.contains(num[i])){
				primes++;
			}
		}
		double res=primes/count;
		while(res>=0.1){
			n++;
			num[0]=(2*n+1)*(2*n+1);
			num[1]=(4*n*n+1);
			num[2]=(num[0]+num[1])/2;
			num[3]=num[1]+num[2]-num[0];
			count+=4;
			for(int i=1;i<4;i++){
				if(t.contains(num[i])){
					primes++;
				}
			}
			res=primes/count;
		}
		System.out.print(2*n+1);
	}
}
