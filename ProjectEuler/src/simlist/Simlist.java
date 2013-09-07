package simlist;

import java.util.ArrayList;

public class Simlist {
	public static ArrayList<Integer> listgen(int lim){
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
