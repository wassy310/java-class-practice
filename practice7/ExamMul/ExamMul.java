public class ExamMul {
    public static void main(String[] args) {
        double mul = 0;

        System.out.println("Programmed by Ryoga Washizawa.");

        for(int i=0; i<args.length; i=i+1) {
            mul = mul * Double.parseDouble(args[i]);
            if(i != 0) {
                System.out.print("*");
            }
            System.out.print(args[i]);
        }

        System.out.println("=" + mul);
    }
}