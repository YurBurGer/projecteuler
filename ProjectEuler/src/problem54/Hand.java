package problem54;
import java.util.*;

public class Hand implements Comparable<Hand>{
	Card[] hand=new Card[5];
	public Integer handtype,startcard;
	int[] tpsc;
	public Hand(String s) {
		for(int i=0;i<5;i++){
			hand[i]=new Card(s.substring(3*i, 3*i+2));
		}
		Arrays.sort(hand);
		handtype=gethandtype();
	}
	private int gethandtype(){
		boolean isFlush=false,isStraight=false;
		for(int i=0;i<4;i++){
			isFlush&=(hand[i].suit==hand[i+1].suit);
			isStraight&=((hand[i].value-hand[i+1].suit)==1);
		}
		
		if(isFlush&&isStraight){
			if(hand[0].value==14)
				return 9;
			else
				return 8;
		}
		else{
			if(isFlush)
				return 5;
			if(isStraight)
				return 4;
			if((hand[0].value==hand[1].value)&&(hand[0].value==hand[2].value)){
				startcard=0;
				if(hand[0].value==hand[3].value)
					return 7;
				if(hand[3].value==hand[4].value)
					return 6;
				return 3;
			}
			if((hand[2].value==hand[3].value)&&(hand[2].value==hand[4].value)){
				startcard=2;
				if(hand[2].value==hand[1].value)
					return 7;
				if(hand[0].value==hand[1].value)
					return 6;
				return 3;
			}
			if((hand[1].value==hand[2].value)&&(hand[1].value==hand[3].value)){
				startcard=1;
				return 3;
			}
			int n=0;
			int[] s=new int[2];
			for(int i=0;i<4;i++){
				if(hand[i].value==hand[i+1].value){
					s[n]=i;
					n++;
				}
			}			
			if(n==2){
				tpsc=s;
				return 2;
			}
			if(n==1){
				startcard=s[0];
				return 1;
			}			
		}
		return 0;	
	}
	//TODO
	@SuppressWarnings("unused")
	private void sortbyhandtype(){
		switch (handtype){
		case 7:
			//for(int i=0;i<)
			break;
		default:
			break;
		}
	}
	@Override
	public String toString() {
		String s="";
		for(int i=0;i<5;i++){
			s=s.concat(hand[i].toString()+"_");
		}
		return s;
	}
	@Override
	public int compareTo(Hand o) {
		if(handtype!=o.handtype)
			return handtype.compareTo(o.handtype);
		return 0;			
	}			
}
