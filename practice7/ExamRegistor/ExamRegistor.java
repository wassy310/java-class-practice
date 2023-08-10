public class ExamRegistor {
    public static void main(String[] args) {
        System.out.println("Programmed by Ryoga Washizawa.");

        double dc = 0;
        for(int i=0; i<args.length; i=i+1) {
            dc = dc + Double.parseDouble(args[i]);
            if(i != 0) {
            }
        }

        System.out.println("DC: " + dc + "Ω");
    }
}