public class ExamAbs {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b;

        if(a < 0) {
            b = -a;
        } else {
            b = a;
        }

        System.out.println("Programmed by Ryoga Washizawa.");

        System.out.println(a + "の絶対値は" + Math.abs(a));
    }
}