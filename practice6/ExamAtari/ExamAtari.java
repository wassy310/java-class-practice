public class ExamAtari {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);

        System.out.println("programmed by Ryoga Washizawa.");

        if(3 <= a & a <= 5){
            System.out.println("当たり");
        } else if(0 <= a & a <= 8) {
            System.out.println("ニアミス");
        } else {
            System.out.println("はずれ");
        }
    }
}
