package StringComparators;

/**
 * @author YNZ
 */
public class IteratingAString {

    public static void main(String[] args) {
        String str = "I love java 8 style";
        str.chars().mapToObj(ch -> Character.valueOf((char) ch)).forEach(System.out::println);

        //Query
        long digitNum = str.chars().filter(Character::isDigit).count();
        System.out.println("digits in the sentence: " + digitNum);

    }
}