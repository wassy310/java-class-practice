public class ExamRisoku {
    public static void main(String[] args) {
        if(args.length != 3) {
            System.out.println("Usage: java ExamRisoku <a> <b> <y>");
            return;
        }

        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        int y = Integer.parseInt(args[2]);

        System.out.println("programmed by Ryoga Washizawa.");

        double interest = calculateInterest(a, b, y);
        double totalAmount = a + interest;

        System.out.println("利息 = " + Math.round(interest));
        System.out.println("元利合計 = " + Math.round(totalAmount));
    }

    public static double calculateInterest(double principal, double rate, int years) {
        double interest = principal * (Math.pow(1 + (rate / 100), years) - 1);
        return interest;
    }
}
