public class ExamDaikei {
    public static void main(String[] args) {
        double t1 = Double.parseDouble(args[0]);
        double t2 = Double.parseDouble(args[1]);
        double h = Double.parseDouble(args[2]);
        double s = (t1 + t2) * h / 2;

        System.out.println("Programmed by Ryoga Washizawa.");

        System.out.println("上底" + t1 + "下底" + t2 + "高さ" + h + "の台形の面積 = " + s);
    }
}