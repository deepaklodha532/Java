package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example1 {

    public static void main(String[] args) {

//        String regex="a";
        Pattern pattern = Pattern.compile("a+b*");

        Matcher matcher = pattern.matcher("bbbb");

        boolean matches = matcher.matches();

        System.out.println("result : " + matches);




    }
}
