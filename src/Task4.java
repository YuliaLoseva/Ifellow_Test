public class Task4 {
    public static void main(String[] args) {
        convMethod(12, 45);
    }

    /**
     * Задача 4 посложнее:
     * Напишите метод, который будет вычислять угол между часовой и минутной стрелками часов. На вход функции подаётся время в виде двух переменных: "hours" и "minutes".
     * Расчет угла производить относительно реального поведения стрелок часов.
     */

    public static void convMethod(int hours, int minutes) {
        if (hours < 0 || minutes < 0 || hours > 24 || minutes > 60) {
            System.out.println("Imp input, check values");
        } else {
            if (hours > 12) {
                hours = hours - 12;
            }
            if (hours == 12) {
                hours = 0;
            }
            if (minutes == 60) {
                minutes = 0;
                hours += 1;
                if (hours > 12) {
                    hours = hours - 12;
                }
            }
            double result = Math.abs(((hours * 30.0 + minutes * 0.5) - minutes * 6));
            System.out.println("ur deg is: " + result);
        }

    }

}
