public class ExamKeta {
    public static void main(String[] args) {
        System.out.println("Programmed by Ryoga Washizawa.");

        int a = Integer.parseInt(args[0]);
        int one = a % 10;
        int ten = a % 100 / 10;
        int hun = a % 1000 / 100;
        int tho = a % 10000 / 1000;
        System.out.println("1の位の数値 = " + one);
        System.out.println("10の位の数値 = " + ten);
        System.out.println("100の位の数値 = " + hun);
        System.out.println("1000の位の数値 = " + tho);
    }
}