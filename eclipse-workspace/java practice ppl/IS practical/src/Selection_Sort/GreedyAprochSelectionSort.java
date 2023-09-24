package Selection_Sort;

public class GreedyAprochSelectionSort {
    
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        

        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
            

            System.out.print("Iteration " + (i + 1) + ": ");
            for (int k = 0; k < n; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        
        System.out.print("Initial array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        selectionSort(arr);
    }
}
