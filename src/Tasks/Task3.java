package Tasks;

public class Task3 {
    /**
     * Условие: Напишите метод, который переворачивает цифры целого числа.
     * Учтите переполнение.
     * Пример: 123 → 321, -120 → -21
     */
    public static void main(String[] args) {
        int input = -2147483600;
        StringBuilder sb = new StringBuilder(String.valueOf(input).replaceAll("0+$",""));
        sb.reverse(); //"021-"
        if (sb.charAt(sb.length() - 1) == '-') {
            sb.replace(sb.length() - 1,sb.length(),"");
            sb.insert(0,'-');
        }

        try {
            int result = Integer.parseInt(sb.toString());
            System.out.println(result);
        } catch (NumberFormatException e){
            System.out.println("Переполнение int, long переменная:" + Long.parseLong(sb.toString()));
        }
    }
}

/**
 * 4. Группировка анаграмм
 * Условие: Сгруппируйте слова-анаграммы вместе.
 * Пример: ["eat","nat","tea","tan","ate","bat"] → [["eat","tea","ate"],["tan","nat"],["bat"]]
 *
 */

