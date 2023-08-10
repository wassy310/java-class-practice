public class ExamGCD {
    public static void main(String[] args) {
        if(args.length != 2) {
            System.out.println("Usage: java ExamGCD <m> <n>");
            return;
        }

        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);

        if(m <= 0 || n <= 0) {
            System.out.println("Both inputs should be positive integers.");
            return;
        }

        System.out.println("Programmed by Ryoga Washizawa.");
        System.out.print("最大公約数=" + findGCD(m, n));
    }

    public static int findGCD(int m, int n) {
        while (n != 0) {
            int remainder = m % n;
            m = n;
            n = remainder;
        }
        return m;
    }
}
