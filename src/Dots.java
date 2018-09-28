
// Напишите программу, которая считывает символы
// пока не встретится точка.
// Также предусмотрите вывод количества пробелов.


public class Dots{
        public static void main(String[] args) {

            String string = "The point counter in this sentence.";

        StringBuilder stringBuilder = new StringBuilder(string);
        int end = string.length() - 1;
        String str = stringBuilder.substring(0, end);

        System.out.println(str);

        long count = string.chars().filter(Character::isWhitespace).count();

            System.out.println(count + " spaces");

    }
}

