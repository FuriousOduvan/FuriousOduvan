package RHW4;

import HW3.EmployeeCard;
import org.testng.Assert;
import org.testng.annotations.*;

@Test
public class TestEmployeeCardHW4 {
    public void testEC() {
        testToString("Артем",15,1,1,false);
        testToString("Дарья",15,1,1,true);
        testToString("Антон",15,1,1,false);
        testToString("Света",15,1,1,true);
    }

    private void testToString(String name, int age, double effective, double salary, boolean isWoman) {


        try{
            String expect_res = "Имя работника - " + name + ". Его возраст - " + age + " лет. Его зарплата - " + salary + " в час. Пол - " + isWoman;
            String actual_res = new EmployeeCard(name, age, effective, salary, isWoman).toString();
//        System.out.println(expect_res);
//        System.out.println(actual_res);
            Assert.assertEquals(expect_res, actual_res, "Тест не пройден, текст ошибки:");
        } catch (java.lang.AssertionError e) {
            System.err.print("\n" + e);
        }

    }
}
