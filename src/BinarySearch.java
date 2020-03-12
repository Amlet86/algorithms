public class BinarySearch {

    int[] arr = {1, 3, 5, 7, 9};

    int binarySearch(int findingInt, int[] arr) {
        if (arr.length == 0)
            arr = this.arr;
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int foundInt = arr[mid];
            if (foundInt == findingInt)
                return mid;
            if (foundInt > findingInt)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }
}
