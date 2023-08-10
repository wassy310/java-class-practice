public class ExamDayOfWeek {
    public static void main(String[] args) {
        System.out.println("Programmed by Ryoga Washizawa.");

        if(args.length == 0) {
            System.out.println("引数がありません");
            return;
        }

        int x = Integer.parseInt(args[0]);

        if(x == 0) {
            System.out.println("日曜日です");
        } else if(x == 1) {
            System.out.println("月曜日です");
        } else if(x == 2) {
            System.out.println("火曜日です");
        } else if(x == 3) {
            System.out.println("水曜日です");
        } else if(x == 4) {
            System.out.println("木曜日です");
        } else if(x == 5) {
            System.out.println("金曜日です");
        } else if(x == 6) {
            System.out.println("土曜日です");
        } else {
            System.out.println("0から6までの整数を入力してください");
        }
    }
}