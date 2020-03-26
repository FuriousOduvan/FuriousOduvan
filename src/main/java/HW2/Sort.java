package HW2;

public class Sort {

    /**
     * Метод сортировки массива в убывающем порядке
     * @param arr - массив, который приходит на вход
     * @return отсортированный массив
     */
    public int[] reverseSort(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int t = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = arr[i];
            arr[i] = t;

        }
        // Создать массив, наполнить его числами в возрастающем порядке
        // Необходимо вернуть массив отсортированный в убывающем порядке
        return arr;
    }
}