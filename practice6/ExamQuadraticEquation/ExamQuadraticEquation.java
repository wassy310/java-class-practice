public class ExamQuadraticEquation {
    public static void main(String[] args) {
        System.out.println("Programmed by Ryoga Washizawa.");

        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        double ansP;
        double ansM;
        double d;
        double squ;

        d = b * b - 4 * a * c;
        squ = Math.sqrt(d);

        ansP = (-b + squ) / (2 * a);
        ansM = (-b - squ) / (2 * a);

        // System.out.println(ansP + ", " + ansM);

        if(ansP != ansM) {
            System.out.println("実数解が2つあります");
            System.out.println(ansP);
            System.out.println(ansM);
        } else if(ansP == ansM) {
            System.out.println("解は1つです");
            System.out.println(ansP);
        }
        if(0 > d) {
            System.out.println("虚数解が2つあります");
            System.out.println(ansP + "+" + "i");
            System.out.println(ansM + "+" + "i");
        }
    }
}