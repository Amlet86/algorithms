public class DivideAndConquer {

    int sumOfArray(int[] arr) {
        if (arr.length == 1)
            return arr[0];
        else {
            return +sumOfArray(arr);

        }
    }

    int[] quickSort(int[] arr) {
        if (arr.length < 2)
            return arr;
        if (arr.length == 2) {
            if (arr[0] < arr[1])
                return arr;
            else {
                int tmp = arr[0];
                arr[0] = arr[1];
                arr[1] = tmp;
                return arr;
            }
        } else {
            int pivot = arr[0];
            int[] newArr = quickSort(arr);
            return newArr;
        }
    }
}
