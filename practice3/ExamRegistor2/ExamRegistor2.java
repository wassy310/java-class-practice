public class ExamRegistor2 {
    public static void main(String[] args) {
        double r1 = Double.parseDouble(args[0]);
        double r2 = Double.parseDouble(args[1]);
        double ra = r1 * r2 / (r1+r2);

        System.out.println("Programmed by Ryoga Washizawa.");

        System.out.println(r1 + "Ωと" + r2 + "Ωの合成抵抗値は" + ra + "Ω");
    }
}