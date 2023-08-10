public class ExamTaxi {
    public static void main(String[] args) {
        System.out.println("Programmed by Ryoga Washizawa.");

        int distance = Integer.parseInt(args[0]);
        int price;

        if(distance <= 2000) {
            price = 500;
        } else {
            price = 500 + ((distance - 2000) + 499) / 500 * 100;
        }

        System.out.println(distance + "mの料金は" + price + "です");
    }
}