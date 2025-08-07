package DSA;

public class CombSort {
    
    static void combSort(int[] arr) {
        int n = arr.length;

        int gap = n;

        double shrink = 1.3;

        boolean swapped = true;

        while (gap != 1 || swapped) {
            gap = (int)(gap / shrink);
            if (gap < 1)
                gap = 1;

            swapped = false;

            for (int i = 0; i < n - gap; i++) {
                if (arr[i] > arr[i + gap]) {
                    int temp = arr[i];
                    arr[i] = arr[i + gap];
                    arr[i + gap] = temp;

                    swapped = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {8, 4, 1, 56, 3, 23, 28, 0};

        System.out.print("Original array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        combSort(arr);

        System.out.print("\nSorted array:   ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

