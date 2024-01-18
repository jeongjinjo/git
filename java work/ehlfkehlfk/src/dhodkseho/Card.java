package dhodkseho;

public class Card{
	
	String kind;
	int num;
	static int WIDTH;
	static int HEIGHT;

	public static void main(String[] args) {
		System.out.println("Card.WIDTH="+Card.WIDTH);
		System.err.println("Card.HEIGHT"+Card.HEIGHT);
		
		Card c1=new Card();
		c1.kind ="소나무";
		c1.num=10;
		
		Card c2=new Card();
		c2.kind="세잎클로버";
		c2.num =5;
		
	//	c1.WIDTH=
		
		System.out.println("c1.kind="+c1.kind+c1.num);
		System.out.println("c2.kind"=+c2.kind+c2.num=");
	}
}