public class ExWarizan {
    public static void main(String[] args) {
        System.out.println("Programmed by Ryoga Washizawa.");

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int quo = a / b;
        int rem = a % b;

        System.out.println(a + "/" + b + "の商 = " + quo);
        System.out.println(a + "/" + b + "の余り = " + rem);
    }
}