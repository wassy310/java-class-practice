public class ExamZenkasiki {
    public static void main(String[] args) {
        if(args.length != 5) {
            System.out.println("Usage: java ExamZenkasiki <a0> <a1> <p> <q> <n>");
            return;
        }

        double a0 = Double.parseDouble(args[0]);
        double a1 = Double.parseDouble(args[1]);
        double p = Double.parseDouble(args[2]);
        double q = Double.parseDouble(args[3]);
        int n = Integer.parseInt(args[4]);

        System.out.println("programmed by Ryoga Washizawa.");

        for(int i=2; i<=n; i++) {
            double an = p * a1 + q * a0;
            System.out.println("a" + i + " = (" + p + ")*(" + a1 + ") + (" + q + ")*(" + a0 + ") = " + an);
            a0 = a1;
            a1 = an;
        }
    }
}
