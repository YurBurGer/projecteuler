package sieve_of_Atkin;

public class Testobj implements Comparable<Testobj>{
	public Integer n,r;
	public boolean isPrime;
	/**
	 * @param n
	 */
	public Testobj(int n) {
		this.n = n;
		r=n%60;
		isPrime=false;
	}
	@Override
	public int compareTo(Testobj o) {
		return n.compareTo(o.n);
	}
	
	
}
