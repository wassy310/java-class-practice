public class ExamBinary {
    public static void main(String[] args) {
        System.out.println("Programmed by Ryoga Washizawa.");

        String src = args[0];
		int dst = Integer.parseInt(src, 2);

		System.out.println("2進法の" + src + "は、10進法では" + dst);
    }
}