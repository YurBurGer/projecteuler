package primes;

import java.util.ArrayList;
import java.util.TreeSet;


public class Primes {
	public static TreeSet<Integer> PrimeSet(int lim){
		TreeSet<Integer> res=new TreeSet<>();
		ArrayList<Integer> s=new ArrayList<>();
		for(Integer i=2;i<=lim;i++)
			s.add(i);
		for(int i=0;i<s.size();i++){
			int n=2;
			while(n*s.get(i)<=s.get(s.size()-1)){
				Integer k=n*s.get(i);
				s.remove(k);
				n++;
			}
		}
		res.addAll(s);
		return res;
	}
	public static ArrayList<Integer> PrimeList(int lim){
		ArrayList<Integer> s=new ArrayList<>();
		for(Integer i=2;i<=lim;i++)
			s.add(i);
		for(int i=0;i<s.size();i++){
			int n=2;
			while(n*s.get(i)<=s.get(s.size()-1)){
				Integer k=n*s.get(i);
				s.remove(k);
				n++;
			}
		}
		return s;
	}
}
