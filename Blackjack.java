
public class Blackjack {
	
		public static int blackjack(int a, int b) {
	
		 if (a > b && a <= 21) {
		 return (a); 
		 }
		
		if (b > a && b<=21);
		return b;
		}
		
	public static void main(String[] args) {
		  
	System.out.println(blackjack(21, 12));
}
	}
