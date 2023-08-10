public class ExamLeapYear {
    public static void main(String[] args) {
        System.out.println("Programmed by Ryoga Washizawa.");

        int x = Integer.parseInt(args[0]);

        if(x % 4 == 0) {
            if(x % 100 == 0 && x % 400 != 0) {
                System.out.println("平年です");
            } else {
                System.out.println("閏年です");
            }
        }
    }
}