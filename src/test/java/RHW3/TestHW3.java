package RHW3;

/**
 * Код писать здесь
 */

public class TestHW3 {
    public static void main(String[] args) throws Exception{

        System.out.println("\nТест проверки цены билета");
        TestCalculation tcalc = new TestCalculation();
        tcalc.testTC();

        System.out.println("\nТест проверки карточки сотрудника");
        TestEmployeeCard TEC = new TestEmployeeCard();
        TEC.testEC();

        System.out.println("\nТест маршурта автобуса");
        TestIW testIW = new TestIW();
        testIW.traceBus();
    }

}