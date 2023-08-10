public class ExamCombination {
    public static void main(String[] args) {
        if(args.length != 2) {
            System.out.println("Usage: java ExamCombination <n> <m>");
            return;
        }

        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);

        if(n<m || n<0 || m<0) {
            System.out.println("Invalid values. n must be greater than or equal to m, and both must be non-negative.");
            return;
        }

        System.out.println("programmed by Ryoga Washizawa.");
        System.out.println(n + "P" + m + " = " + calculatePermutation(n, m));
        System.out.println(n + "C" + m + " = " + calculateCombination(n, m));
    }

    public static double calculatePermutation(int n, int m) {
        double result = 1;
        for(int i=0; i<m; i++) {
            result *= n - i;
        }
        return result;
    }

    public static double calculateCombination(int n, int m) {
        double permutation = calculatePermutation(n, m);
        double factorialM = calculateFactorial(m);
        return permutation / factorialM;
    }

    public static double calculateFactorial(int num) {
        if(num == 0) {
            return 1;
        } else {
            return num * calculateFactorial(num - 1);
        }
    }
}
