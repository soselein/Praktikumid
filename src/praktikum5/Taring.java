package praktikum5;

public class Taring {
	public static void main (String [] args) {
		String taring[][] = {
			{
				"+-------+",
				"|       |",
				"|   *   |",
				"|       |",
				"+-------+"
			},
			{
				"+-------+",
				"|       |",
				"| *   * |",
				"|       |",
				"+-------+"
			},
			{
				"+-------+",
				"| *     |",
				"|   *   |",
				"|     * |",
				"+-------+"
			},
			{
				"+-------+",
				"| *   * |",
				"|       |",
				"| *   * |",
				"+-------+"
			},
			{
				"+-------+",
				"| *   * |",
				"|   *   |",
				"| *   * |",
				"+-------+"
			},
			{
				"+-------+",
				"| *   * |",
				"| *   * |",
				"| *   * |",
				"+-------+"
			}
		};
		int i;
		int t1 = (int)(Math.random() * taring.length);
		int t2 = (int)(Math.random() * taring.length);
		
		for (i = 0; i < taring[t1].length; i++) {
			System.out.println(taring[t1][i] + " " + taring[t2][i]);
		}
		
	}
}