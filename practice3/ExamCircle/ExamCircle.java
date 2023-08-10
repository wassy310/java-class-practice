public class ExamCircle {
    public static void main(String[] args) {
        double r = Double.parseDouble(args[0]);
        double c = r * 2 * 3.14;
        double s = r * r * 3.14;

        System.out.println("Programmed by Ryoga Washizawa.");

        System.out.println("半径" + r + "の円周の長さ = " + c);
        System.out.println("半径" + r + "の円の面積 = " + s);
    }
}