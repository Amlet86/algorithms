public class SelectionSort {

    int[] arr = {8, 6, -8, 2, -5, 0, 10};

    int findSmallest(int[] arr) {
        if (arr.length == 0)
            arr = this.arr;
        int smallest = arr[0];
        int smallestIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
                smallestIndex = i;
            }
        }
        return arr[smallestIndex];
    }

    int[] deleteElementFromArray(int[] arr, int element) {
        int[] newArr = new int[arr.length - 1];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != element)
                newArr[i] = arr[i];
            else {
                for (int j = i; j < arr.length - 1; j++) {
                    newArr[j] = arr[j + 1];
                }
                break;
            }
        }
        return newArr;
    }

    int[] selectionSort(int[] arr) {
        if (arr.length == 0)
            arr = this.arr;
        int[] newArr = new int[arr.length];
        int maxLength = arr.length;

        for (int i = 0; i < maxLength; i++) {
            int smallest = findSmallest(arr);
            newArr[i] = smallest;
            arr = deleteElementFromArray(arr, smallest);
        }
        return newArr;
    }
}
