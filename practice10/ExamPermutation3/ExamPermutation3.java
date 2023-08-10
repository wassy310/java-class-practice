public class ExamPermutation3 {
    public static void main(String[] args) {
        if(args.length < 3) {
            System.out.println("Usage: java ExamPermutation3 <numbers>");
            return;
        }

        int[] A = new int[10];
        for(String arg : args) {
            try {
                int num = Integer.parseInt(arg);
                if(num>=0 && num<=9) {
                    A[num]++;
                }
            } catch (NumberFormatException e) {
            }
        }

        System.out.println("programmed by Ryoga Washizawa.");

        for(int i=0; i<10; i++) {
            if(A[i] > 0) {
                for (int j=0; j<10; j++) {
                    if (A[j]>0 && j!=i) {
                        for (int k=0; k<10; k++) {
                            if (A[k]>0 && k!=i && k!=j) {
                                System.out.print(" " + i + j + k);
                            }
                        }
                    }
                }
            }
        }

        System.out.println();
    }
}
