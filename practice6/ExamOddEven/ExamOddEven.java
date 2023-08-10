public class ExamOddEven {
    public static void main(String[] args) {
        System.out.println("Programmed by Ryoga Washizawa.");

        int a = Integer.parseInt(args[0]);

        if(a > 0) {
            if(a % 2 == 0) {
                System.out.println(a + "は偶数です");
            } else {
                System.out.println(a + "は奇数です");
            }
        }
    }
}