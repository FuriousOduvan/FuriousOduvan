package RHW2;

import HW2.CompareObjects;

public class TestCO {
    public void testCompareObjects(){
        Object object1 = new Object();
        Object object2 = new Object();
        CompareObjects compareO = new CompareObjects();

        System.out.println(compareO.compare(object1, object2));
        System.out.println(compareO.compareToString(object1, object2));
        System.out.println(compareO.compareHashCode(object1, object2));

        System.out.println(compareO.compareObj(object1, object2));
        System.out.println(compareO.compareToStringObj(object1, object2));
        System.out.println(compareO.compareHashCodeObj(object1, object2));
    }
}
