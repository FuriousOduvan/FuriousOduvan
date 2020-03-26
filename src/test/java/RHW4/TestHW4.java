package RHW4;

public class TestHW4 {
    public static void main(String[] args) throws Exception{

        System.out.println("\nТест проверки цены билета");
        TestCalculationHW4 tcalc = new TestCalculationHW4();
        tcalc.testTC();

        System.out.println("\nТест проверки карточки сотрудника"); //Закоммитил так как всегда возвращает ошибку и программа останавливается
        TestEmployeeCardHW4 TEC = new TestEmployeeCardHW4();
        TEC.testEC();

        System.out.println("\nТест маршурта автобуса");
        TestIWHW4 testIW = new TestIWHW4();
        testIW.traceBus();
    }
}
