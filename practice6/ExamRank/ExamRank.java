public class ExamRank {
    public static void main(String[] args) {
        System.out.println("Programmed by Ryoga Washizawa.");

        int x = Integer.parseInt(args[0]);

        if(100 >= x) {
            if(x >= 90) {
                System.out.println(x + "点はSです");
            } else if(x >= 80) {
                System.out.println(x + "点はAです");
            } else if(x >= 70) {
                System.out.println(x + "点はBです");
            } else if(x >= 60) {
                System.out.println(x + "点はCです");
            } else if(x >= 0) {
                System.out.println(x + "点はFです");
            }
        } else {
            System.out.println("入力可能な点数は100点以下です");
        }
    }
}