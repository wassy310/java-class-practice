public class ExamAverage {
    public static void main(String[] args) {
        double ave = 0;

        System.out.println("Programmed by Ryoga Washizawa.");

        for(int i=0; i<args.length; i=i+1) {
            ave = ave + Double.parseDouble(args[i]);
            if(i != 0) {System.out.print("+");}
        }

        System.out.println("平均は" + ave);
    }
}