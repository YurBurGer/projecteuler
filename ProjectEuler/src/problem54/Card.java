package problem54;

public class Card implements Comparable<Card>{
	public Integer value,suit;
	public Card(String s) {
		switch (s.charAt(0)){
		case 'J':
			this.value=11;
			break;
		case 'Q':
			this.value=12;
			break;
		case 'K':
			this.value=13;
			break;
		case 'A':
			this.value=14;
			break;
		default:
			this.value=(s.charAt(0)-'0');
		}
		switch (s.charAt(1)){
		case 'S':
			this.suit=0;
			break;
		case 'C':
			this.suit=1;
			break;
		case 'D':
			this.suit=2;
			break;
		case 'H':
			this.suit=3;
			break;		
		}		
	}	
	public int compareTo(Card o) {
		if(value!=o.value)
			return -1*value.compareTo(o.value);
		else
			return suit.compareTo(o.suit);
	}
	@Override
	public String toString() {
		return value+"-"+suit;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((suit == null) ? 0 : suit.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}	
}
