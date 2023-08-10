public class ExamAdmissionFee {
    public static void main(String[] args) {
        System.out.println("Programmed by Ryoga Washizawa.");

        int age = Integer.parseInt(args[0]);

        if(age < 6) {
            System.out.println(age + "才の入場料は50円です");
        } else if(age < 12) {
            System.out.println(age + "才の入場料は1000円です");
        } else if(age < 20) {
            System.out.println(age + "才の入場料は2000円です");
        } else {
            System.out.println(age + "才の入場料は3000円です");
        }
    }
}
