public class ExamMul21 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = (a<<4) + (a<<2) + a;

        System.out.println("Programmed by Ryoga Washizawa.");

        System.out.println(a + "<<4" + a + "<<2 の値は " + b);
    }
}