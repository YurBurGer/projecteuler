package problem54;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Hand h=new Hand("5H 5C 6S 7S KD");
		System.out.println(h.toString());
		System.out.println(h.handtype+"  "+h.startcard);
	}

}
