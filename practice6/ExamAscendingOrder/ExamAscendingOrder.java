public class ExamAscendingOrder {
    public static void main(String[] args) {
        System.out.println("Programmed by Ryoga Washizawa.");

        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        double temp;

        if(a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        if(a > c) {
            temp = a;
            a = c;
            c = temp;
        }
        if(b > c) {
            temp = b;
            b = c;
            c = temp;
        }

        System.out.println(a + " " + b + " " + c);
    }
}
