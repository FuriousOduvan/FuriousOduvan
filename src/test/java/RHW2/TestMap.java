package RHW2;

import HW2.Map;

import java.util.HashMap;

public class TestMap {
    public void testMap(){
        Map map =new Map();
        String firstName;
        String lastName;
        System.out.println(map.countElementsInMap("ерохин", "сергей"));

        System.out.println("Тест удаления определенного элемента из HashMap");
        HashMap<String, String> secondMap = new HashMap<String, String>();
        secondMap.put("Ключ1", "Это удалим");
        secondMap.put("Ключ2", "Это оставим");
        secondMap.put("Ключ3", "Это оставим");

        System.out.println(map.deleteValueFromMap(secondMap, "Это удалим"));

    }
}
