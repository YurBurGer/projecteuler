package euler;

import java.util.TreeMap;

public class Problem17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeMap<Integer,String> m=new TreeMap<>();
		TreeMap<Integer,Integer> m1=new TreeMap<>();
		m.put(1, "one");
		m.put(2, "two");
		m.put(3, "three");
		m.put(4, "four");
		m.put(5, "five");
		m.put(6, "six");
		m.put(7, "seven");
		m.put(8, "eight");
		m.put(9, "nine");
		m.put(10, "ten");
		m.put(11, "eleven");
		m.put(12, "twelve");
		m.put(13, "thirteen");
		m.put(14, "fourteen");
		m.put(15, "fifteen");
		m.put(16, "sixteen");
		m.put(17, "seventeen");
		m.put(18, "eighteen");
		m.put(19, "nineteen");
		m.put(20, "twenty");
		m.put(30, "thirty");
		m.put(40, "forty");
		m.put(50, "fifty");
		m.put(60, "sixty");
		m.put(70, "seventy");
		m.put(80, "eighty");
		m.put(90, "ninety");
		m.put(100, "hundred");
		m.put(1000, "thousand");
		for(Integer i : m.keySet())
			m1.put(i, m.get(i).length());
		int sum=0;
		for(int i=1;i<=1000;i++){
			sum+=getwordlen(m1,i);
		}
		System.out.print(sum);
	}
	public static int getwordlen(TreeMap<Integer,Integer> m1,int n){
		int sum=0;
		int t=n/1000;
		if(t>0)
			sum+=m1.get(t)+m1.get(1000);
		n%=1000;
		int h=n/100;
		if(h>0)
			sum+=m1.get(h)+m1.get(100);
		n%=100;					
		if(((h>0)||(t>0))&&(n>0))
			sum+=3;
		if((n>=10)&&(n<=20))
			sum+=m1.get(n);
		else{
			int tens=n/10;
			if(tens>0)
				sum+=m1.get(tens*10);
			n%=10;
			if(n>0)
				sum+=m1.get(n);
		}
		return sum;
	}
}
