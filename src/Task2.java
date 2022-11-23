public class Task2 {
    public static void main(String[] args) {
        findDuplicateLetter("sooooooomething");
    }

    /**
     * Задача 2 средняя:
     * Написать программу, которая должна найти и вывести повторяющийся символ в слове «Hello»
     */

    public static void findDuplicateLetter(String someStr) {
        String strToLower = someStr.toLowerCase();
        String result = "";
        char[] someChars = strToLower.toCharArray();

        for (int i = 0; i <= strToLower.length(); i++) {
            for (int j = i + 1; j < strToLower.length(); j++) {
                if (someChars[i] == someChars[j]) {
                    result = result + someChars[i];
                }
            }
        }

        System.out.println("Base string is: " + someStr);
        System.out.println("Duplicate character: " + result);

    }
}
