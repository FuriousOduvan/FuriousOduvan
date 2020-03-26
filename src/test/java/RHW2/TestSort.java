package RHW2;

import HW2.Sort;

public class TestSort {
    public void testSort() {
        int[] massive = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Sort sort = new Sort();

        int [] sortMassive = sort.reverseSort(massive);

        for (int s = 0; s < sortMassive.length; s++){
            System.out.println(sortMassive[s]);
        }
    }
}
