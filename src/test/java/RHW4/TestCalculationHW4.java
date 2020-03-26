package RHW4;

import HW3.Calculation;
import org.testng.Assert;
import org.testng.annotations.*;

@Test
public class TestCalculationHW4 {
    public void testTC() throws Exception {
        testDiscount(0, 1);
        testDiscount(1, 0.7);
        testDiscount(4, 0.7);
        testDiscount(5, 0.8);
        testDiscount(11, 0.8);
        testDiscount(12, 0.85);
        testDiscount(14, 0.85);
        testDiscount(15, 1);
        testDiscount(-1, 1);

        testCountTicketPrice(100, 0.85,85);
        testCountTicketPrice(100, 0.8,80);
        testCountTicketPrice(100, 0.7,70);
        testCountTicketPrice(100, 1,100);
        testCountTicketPrice(0, 0.85,0);
        testCountTicketPrice(-1, 0.85,0);
    }

    private void testDiscount(double salary, double discont) throws Exception{
        double discountPrice = 0;
        discountPrice = Calculation.discount(salary);
        //System.out.println(discountPrice);
        //System.out.println(discont);
        Assert.assertEquals(discountPrice, discont, "Тест не пройден");
    }

    private void testCountTicketPrice(int startingPrice, double discount, double finalPrice){
        double discountPrice = 0;
        discountPrice = Calculation.countTicketPrice(startingPrice, discount);
        Assert.assertEquals(discountPrice, finalPrice, "Тест не пройден");
    }

}
