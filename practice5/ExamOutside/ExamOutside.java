public class ExamOutside {
	public static void main(String[] args) {
		System.out.println("Programmed by Ryoga Washizawa.");

		double x = Double.parseDouble(args[0]);
		double a = 1.0;
		double b = 5.0;
		boolean c = (x <= a) | (b <= x);

		System.out.println(x + "<=" + a + " | " + b + "<=" + x + " の値は " + c);
	}
}
