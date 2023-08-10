public class ExamLCM {
    public static void main(String[] args) {
        if(args.length != 2) {
            System.out.println("Usage: java ExamLCM <A> <B>");
            return;
        }

        int A = Integer.parseInt(args[0]);
        int B = Integer.parseInt(args[1]);

        if(A <= 0 || B <= 0) {
            System.out.println("Both inputs should be positive integers.");
            return;
        }

        System.out.println("Programmed by Ryoga Washizawa.");
        System.out.print("最小公倍数=" + calculateLCM(A, B));
    }

    public static int calculateLCM(int A, int B) {
        int gcd = calculateGCD(A, B);
        return (A * B) / gcd;
    }

    public static int calculateGCD(int m, int n) {
        while(n != 0) {
            int remainder = m % n;
            m = n;
            n = remainder;
        }
        return m;
    }
}
