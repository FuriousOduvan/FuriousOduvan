package RHW2;

/**
 * Код писать здесь
 */

public class TestHW2 {
    public static void main(String[] args){
        System.out.println("\nТест сравнения");
        TestCO testCompareObjects = new TestCO();
        testCompareObjects.testCompareObjects();

        System.out.println("\nТест подсчета одинаковых элементов");
        TestMap testMap = new TestMap();
        testMap.testMap();

        System.out.println("\nТест обратной сортировки");
        TestSort testSort = new TestSort();
        testSort.testSort();
    }
}
