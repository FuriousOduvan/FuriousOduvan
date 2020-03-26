package RHW3;

import HW3.IndividualWork;

public class TestIW {

    public void traceBus(){
        System.out.println("Позитивные тесты:");
        testBus(0, "Комсомольская");
        testBus(1, "Комсомольская");
        testBus(7, "Комсомольская");
        testBus(8, "Комсомольская");
        testBus(9, "Ленина");
        testBus(11, "Ленина");
        testBus(12, "Тимирязевская");
        testBus(14, "Тимирязевская");

        System.out.println("Негативные тесты:");
        testBus(15, "Тимирязевская");
        testBus(-1, "Тимирязевская");

    }

    private void testBus(double time, String expect_trace){
        String actual_trace = new IndividualWork().bus(time);
        if(actual_trace.equals(expect_trace) ){
            System.out.println("Тест пройден, станция - " + expect_trace);
        } else{
            System.out.println("Тест не пройден, сейчас станция - " + actual_trace);
        }
    }
}
