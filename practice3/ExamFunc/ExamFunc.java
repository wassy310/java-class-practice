public class ExamFunc {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y1 = x * x * x + 3 * x * x + 2;
        double y2 = (x+3) * (x+3) * (x+3) / 5 - 7;

        System.out.println("Programmed by Ryoga Washizawa.");

        System.out.println("x^3 + 3(x^2) + 2 = " + y1);
        System.out.println("(x+3)^3 / 5 - 7 = " + y2);
    }
}