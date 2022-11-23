public class Task3 {
    public static void main(String[] args) {
        baseConverter("C", 30);
    }

    /**
     * Задача 3 посложнее:
     * Напишите класс BaseConverter для конвертации из градусов по Цельсию в
     * Кельвины, Фаренгейты, и так далее. У метода должен быть метод convert, который
     * и делает конвертацию.
     * При запуске кода должна быть возможность ввести градусы Цельсия и выбора конвертации в Кельвины или Фаренгейты
     */

    public static void baseConverter(String system, double deg) {
        if (system == "C") {
            double degF = (deg * 1.8 + 32);
            System.out.println("F° = " + degF);
            double degK = (deg + 273.15);
            System.out.println("K° = " + degK);
        } else if (system == "F") {
            double degC = ((deg - 32) / 1.8);
            System.out.println("C° = " + degC);
            double degK = ((deg + 459.67) * 1.8);
            System.out.println("K° = " + degK);
        } else if (system == "K") {
            double degF = (deg * 1.8 - 459.67);
            System.out.println("F° = " + degF);
            double degC = (deg - 273.15);
            System.out.println("C° = " + degC);
        } else {
            System.out.println("Incorrect value (\"C\", \"K\", \"F\")");
        }
    }

}
