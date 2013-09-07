package euler;

public class Problem14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final int s=75000001;
		short[] l=new short[s];
		short n=0;
		for(int i=1;i<=s;i*=2){
			n++;
			l[i]=n;
		}
		n=0;
		for(int i=5;i<=s;i*=2){
			n++;
			l[i]=(short) (l[16]+n);
		}
		n=0;
		for(int i=3;i<=s;i*=2){
			n++;
			l[i]=(short) (l[10]+n);
		}
		n=0;
		for(int i=13;i<=s;i*=2){
			n++;
			l[i]=(short) (l[40]+n);
		}
		for(int i=7;i<=s;i*=2){
			getsize(i,l);
		}
		for(int i=1;i<=1000;i++){
			getsize(i,l);
		}
		for(int i=1000;i<=10000;i++){
			getsize(i,l);
		}
		for(int i=10000;i<=100000;i++){
			getsize(i,l);
		}
		System.out.println(getsize(7,l));
	}
	public static short getsize(int e,short[] l){
		if(l[e]==0){
			if(e%2==0)
				l[e]=(short) (getsize(e/2,l)+1);
			else
				l[e]=(short) (getsize(3*e+1,l)+1);
		}
		return l[e];
	}
}
