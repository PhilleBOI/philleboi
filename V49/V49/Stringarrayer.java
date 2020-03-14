package V49;

public class Stringarrayer {

	public static void main(String[] args) {

		String[] namn = { "Malte", "Emil", "Petter", "Linus" };

		for (int i = 0; i < 40; i++) {

			for (int j = 1; j <= namn.length; j++) {

				System.out.println(j + ". " + namn[j - 1]);
			}

		}

	}

}
