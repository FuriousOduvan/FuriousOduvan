package RHW4;

import HW3.IndividualWork;
import org.testng.Assert;
import org.testng.annotations.*;

@Test
public class TestIWHW4 {
    public void traceBus(){
        testBus(0, "Комсомольская");
        testBus(1, "Комсомольская");
        testBus(7, "Комсомольская");
        testBus(8, "Комсомольская");
        testBus(9, "Ленина");
        testBus(11, "Ленина");
        testBus(12, "Тимирязевская");
        testBus(14, "Тимирязевская");
//        testBus(15, "Тимирязевская");
//        testBus(-1, "Тимирязевская");

    }

    private void testBus(double time, String expect_trace){
        String actual_trace = new IndividualWork().bus(time);
        Assert.assertEquals(actual_trace, expect_trace, "Тест не пройден");
    }
}
