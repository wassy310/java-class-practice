public class ExamBubbleSort {
    public static void main(String[] args) {
        System.out.println("Programmed by Ryoga Washizawa.");

        int[] a = {5, 2, 9, 1, 5, 6};
        int n = a.length;

        System.out.println("Original array:");
        printArray(a);

        for(int i=0; i<n-1; i++) {
            for(int j=n-1; j>i; j--) {
                if(a[j-1] > a[j]) {
                    int temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;

                    System.out.println("a[j-1]とa[j]を交換");
                    printArray(a);
                }
            }
        }

        System.out.println("Sorted array:");
        printArray(a);
    }

    public static void printArray(int[] arr) {
        for(int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
