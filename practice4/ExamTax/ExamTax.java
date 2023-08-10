public class ExamTax {
    public static void main(String[] args) {
        System.out.println("Programmed by Ryoga Washizawa.");

        int a = Integer.parseInt(args[0]);
        int b = a * 108;
        int ans1 = b / 100;
        int ans2 = (b + 99) / 100;
        int ans3 = (b + 50) / 100;

        System.out.println("切り捨て価格 = " + ans1);
        System.out.println("切り上げ価格 = " + ans2);
        System.out.println("四捨五入価格 = " + ans3);
    }
}