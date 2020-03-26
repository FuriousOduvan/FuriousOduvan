package HW3;

public class Calculation {
    /**
     * Метод рассчета скидки, взависимости от зарпалты в час.
     * Чем больше зарплата - тем меньше скидка
     *
     * @param salary - зарплата
     * @return
     */
    public static double discount(double salary) {
        double discountPrice = 0;

        if (salary >= 12 & salary < 15.0) {
            //System.out.println("Скидка составляет - 15%");
            discountPrice = 0.85;
        } else if (salary >= 5 & salary < 12.0) {
            //System.out.println("Скидка составляет - 20%");
            discountPrice = 0.8;
        } else if (salary > 0 & salary < 5.0) {
            //System.out.println("Скидка составляет - 30%");
            discountPrice = 0.7;
        } else {
            //System.out.println("Скидки не будет!");
            discountPrice = 1;
        }

        return discountPrice;
        // Посчитайте скидку с разными параметрами. Выведите корректную скидку на экран.
    }

    /**
     * Метод рассчета стоимости билета со скидкой.
     * Для рассчета скидки, используйте метод discount
     *
     * @param ticketPrice - стоимость билета
     * @param discount - скидка
     * @return стоимость билета со скидкой
     */
    public static double countTicketPrice(int ticketPrice, double discount) {
        if (ticketPrice > 0) {
            return ticketPrice * discount;
        } else{
            return 0;
        }

    }
    // Метод должен корректно считать окончательную стоимость билета
}
