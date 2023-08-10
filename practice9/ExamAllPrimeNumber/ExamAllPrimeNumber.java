public class ExamAllPrimeNumber {
    public static void main(String[] args) {
        System.out.println("Programmed by Ryoga Washizawa.");

        if(args.length != 1) {
            System.out.println("Usage: java ExamAllPrimeNumber <n>");
            return;
        }

        int n = Integer.parseInt(args[0]);

        if(n < 2) {
            System.out.println("Input should be an integer greater than or equal to 2.");
            return;
        }

        int[] primes = new int[10000];
        primes[0] = 2;
        int numOfPrimes = 1;

        for(int i=3; i<=n; i+=2) {
            boolean isPrime = true;

            for (int j=0; j<numOfPrimes; j++) {
                if (i % primes[j] == 0) {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime) {
                if (numOfPrimes < primes.length) {
                    primes[numOfPrimes] = i;
                    numOfPrimes++;
                } else {
                    System.out.println("Array size exceeded.");
                    break;
                }
            }
        }

        for(int k=0; k<numOfPrimes; k++) {
            System.out.print(primes[k] + " ");
        }
    }
}
