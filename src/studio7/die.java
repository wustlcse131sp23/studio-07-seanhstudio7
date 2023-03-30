package studio7;

public class die {
	private int sides;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		die die1 = new die(9);
		int number = die1.thrown();
		System.out.print(number);

	}
/***
 * Constructor for the die class.
 * @param inisides
 */
	public die(int inisides) {
		sides = inisides;
	}
/***
 * The method random generates a random integer when we thrown the die
 * @return
 * 
 */
	public int thrown() {
		int random_int = (int)Math.floor(Math.random() * (sides) + 1);
		return random_int;
	}

}
