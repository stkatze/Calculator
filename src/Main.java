public class Main {
    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);

        /*
        * Возникает ошибка деления на 0. Делить на 0 нельзя, поэтому выкидываем иключение в основную программу,
        которая использует класс Calculator
         */

        try {
            int c = calc.devide.apply(a, b);
            calc.println.accept(c);
        } catch (ArithmeticException exception) {
            /*
             * Принимаем меры при возникновении ошибки.
             */
            exception.printStackTrace();
        }
    }
}
