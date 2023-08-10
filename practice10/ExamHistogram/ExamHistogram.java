public class ExamHistogram {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java ExamHistogram <numbers>");
            return;
        }

        int[] frequency = new int[10];

        for (String arg : args) {
            try {
                int num = Integer.parseInt(arg);
                if (num >= 0 && num <= 9) {
                    frequency[num]++;
                }
            } catch (NumberFormatException e) {
            }
        }

        System.out.println("programmed by Ryoga Washizawa.");

        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < frequency[i]; j++) {
                System.out.print("■");
            }
            System.out.println();
        }
    }
}
