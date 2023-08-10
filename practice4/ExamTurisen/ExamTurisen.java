public class ExamTurisen {
    public static void main(String[] args) {
        System.out.println("Programmed by Ryoga Washizawa.");

        int a = Integer.parseInt(args[0]);
        int change = 1000 - a;
        int ans1 = change / 500;        // 500
        int ans2 = change - 500 * ans1;     // 500
        int ans3 = ans2 / 100;      // 100
        int ans4 = ans2 - 100 * ans3;       // 100
        int ans5 = ans4 / 50;       // 50
        int ans6 = ans4 - 50 * ans5;        // 50
        int ans7 = ans6 / 10;       // 10
        int ans8 = ans6 - 10 * ans7;        // 10
        int ans9 = ans8 / 5;        // 5
        int ans10 = ans8 - 5 * ans9;        // 5
        int ans11 = ans10 / 1;      // 1
        int ans12 = ans10 - 1 * ans11;      // 1

        System.out.println("500円玉" + ans1 + "個　100円玉" + ans3 + "個　50円玉" + ans5 + "個　10円玉" + ans7 + "個　5円玉" + ans9 + "個　1円玉" + ans11 + "個");
    }
}