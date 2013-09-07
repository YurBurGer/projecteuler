package primes;

import java.util.LinkedList;
import java.util.TreeSet;


public class Primes {
	public static TreeSet<Integer> PrimeSet(int lim){
		TreeSet<Integer> res=new TreeSet<>();
		res.addAll(PrimeList(lim));
		return res;
	}
	public static LinkedList<Integer> PrimeList(int lim){
		LinkedList<Integer> s=new LinkedList<>();
		s.add(2);
		s.add(3);
		for(Integer i=5;i<=lim;i+=2){
			boolean f=true;
			int k=1;
			while(s.get(k)<=Math.sqrt(i)&&f){
				f&=(i%s.get(k)!=0);
				k++;
			}
			if(f)
				s.add(i);
		}
		return s;
	}
}
