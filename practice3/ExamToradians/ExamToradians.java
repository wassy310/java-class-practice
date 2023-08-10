public class ExamToradians {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double r = a * 3.14 / 180;

        System.out.println("Programmed by Ryoga Washizawa.");

        System.out.println(a + "度 = " + r + "ラジアン");
    }
}