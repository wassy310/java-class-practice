import java.util.Arrays;

public class ExamChuukannchi {
    public static void main(String[] args) {
        if(args.length == 0) {
            System.out.println("Usage: java ExamChuukannchi <numbers>");
            return;
        }

        double[] numbers = new double[args.length];
        for(int i = 0; i < args.length; i++) {
            numbers[i] = Double.parseDouble(args[i]);
        }

        System.out.println("Programmed by Ryoga Washizawa.");
        System.out.println("最大値:" + findMax(numbers));
        System.out.println("最小値:" + findMin(numbers));
        System.out.println("平均値:" + findAverage(numbers));
        System.out.println("中間値:" + findMedian(numbers));
    }

    public static double findMax(double[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    public static double findMin(double[] arr) {
        Arrays.sort(arr);
        return arr[0];
    }

    public static double findAverage(double[] arr) {
        double sum = 0.0;
        for (double num : arr) {
            sum += num;
        }
        return sum / arr.length;
    }

    public static double findMedian(double[] arr) {
        Arrays.sort(arr);
        int middleIndex = arr.length / 2;
        return arr[middleIndex];
    }
}
