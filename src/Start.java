import java.util.Arrays;

public class Start {

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        System.out.println(Arrays.toString(selectionSort.selectionSort(new int[0])));
    }

}
