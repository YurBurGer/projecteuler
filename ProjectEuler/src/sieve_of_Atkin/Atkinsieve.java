package sieve_of_Atkin;

import java.util.ArrayList;
import java.util.LinkedList;

public class Atkinsieve {
	ArrayList<Testobj> result=new ArrayList<>();
	LinkedList<Testobj> analysis;
	int n;
	/**
	 * @param n
	 */
	public Atkinsieve(int n) {
		this.n = n;
		result.add(new Testobj(2));
		result.add(new Testobj(3));
		result.add(new Testobj(5));
		for(int i=6;i<=n;i++){
			analysis.add(new Testobj(i));			
		}
		
	}	
}
