public class ExamTouhi {
    public static void main(String[] args) {
        System.out.println("programmed by Ryoga Washizawa.");

        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        int n = Integer.parseInt(args[2]);
        double sum = 0.0;

        for(int i=0; i<n; i=i+1) {
            double p = 1.0;
            for(int j=0; j<i; j=j+1) {
                p = p * b;
            }
            sum = sum + a * p;
        }

        System.out.println("総和 = " + sum);
    }
}
