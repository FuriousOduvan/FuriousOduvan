package RHW3;

import HW3.EmployeeCard;

public class TestEmployeeCard {

    public void testEC(){
        testToString("Артем",15,1,1,false);
        testToString("Дарья",15,1,1,true);
        testToString("Антон",15,1,1,false);
        testToString("Света",15,1,1,true);
    }

    private void testToString(String name, int age, double effective, double salary, boolean isWoman) {
        String expect_res = "Имя работника - " + name + ". Его возраст - " + age + " лет. Его зарплата - " + salary + " в час. Пол - " + isWoman;
        String actual_res = new EmployeeCard(name, age, effective, salary, isWoman).toString();
//        System.out.println(expect_res);
//        System.out.println(actual_res);

        if(expect_res.equals(actual_res)){
            System.out.println("Тест пройден");
        } else{
            System.out.println("Тест не пройден");//Всегда не пройден, т.к. в expect_res значение isWoman - true, а в actual_res значение isWoman - Женский
        }
    }



}
