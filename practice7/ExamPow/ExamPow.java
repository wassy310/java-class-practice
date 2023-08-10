public class ExamPow {
    public static void main (String[] args) {
        System.out.println("Programmed by Ryoga Washizawa.");

        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int ans = 1;

        for(int i=0; i<y; i++) {
            ans *= x;
        }

        System.out.println(x + "の" + y + "乗 = " + ans);
    }
}
