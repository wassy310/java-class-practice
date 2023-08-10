public class ExamPrimeFactor {
    public static void main(String[] args) {
        if(args.length != 1) {
            System.out.println("Usage: java ExamPrimeFactor <n>");
            return;
        }

        int n = Integer.parseInt(args[0]);

        if(n <= 0) {
            System.out.println("Input should be a positive integer.");
            return;
        }

        System.out.println("Programmed by Ryoga Washizawa.");
        System.out.print(n + "=");

        int divisor = 2;
        boolean firstFactor = true;

        while(n > 1) {
            if(n % divisor == 0) {
                if(!firstFactor) {
                    System.out.print("*");
                }
                System.out.print(divisor);
                n /= divisor;
                firstFactor = false;
            } else {
                divisor++;
            }
        }

        System.out.println();
    }
}
