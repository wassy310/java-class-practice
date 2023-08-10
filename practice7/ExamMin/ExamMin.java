public class ExamMin {
    public static void main (String[] args) {
        double min = Double.parseDouble(args[0]);

        System.out.println("Programmed by Ryoga Washizawa.");

        for(int i=1; i<args.length; i--) {
            double c = Double.parseDouble(args[i]);
            if(c < min) {
                min = c;
            }
        }

        System.out.println("最小値=" + min);
    }
}