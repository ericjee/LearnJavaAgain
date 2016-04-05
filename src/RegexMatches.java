import com.sun.org.apache.regexp.internal.RE;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by eric on 3/31/16.
 */
public class RegexMatches {
    private static final String REGEX = "a*b";
    private static String INPUT = "aabfooaabfooabfoob";
    private static String REPLACE = "-";

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(INPUT);
        StringBuffer sb = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(sb, REPLACE);
        }
        matcher.appendTail(sb);
        System.out.println(sb.toString());
    }
//    private static final String REGEX = "dog";
//    private static String INPUT = "The dog says meow. " +
//            "All dogs say meow.";
//    public static final String REPLACE = "cat";
//
//    public static void main(String[] args) {
//        Pattern pattern = Pattern.compile(REGEX);
//        Matcher matcher = pattern.matcher(INPUT);
//        INPUT = matcher.replaceAll(REPLACE);
//        System.out.println(INPUT);
//    }
//    private static final String REGEX = "foo";
//    private static final String INPUT = "fooooooooooo";
//    private static Pattern pattern;
//    private static Matcher matcher;
//
//    public static void main(String[] args) {
//        pattern = Pattern.compile(REGEX);
//        matcher = pattern.matcher(INPUT);
//
//        System.out.println("Current REGEX is: " +REGEX);
//        System.out.println("Current INPUT is: " + INPUT);
//
//        System.out.println("lookingAt(): " + matcher.lookingAt());
//        System.out.println("matches(): " + matcher.matches());
//    }
//    public static void main(String[] args) {
//        String line = "This order was placed for QT3000! OK?";
//        String pattern = "(.*)(\\d+)(.*)";
//
//        Pattern r = Pattern.compile(pattern);
//
//        Matcher matcher = r.matcher(line);
//
//        if(matcher.find()) {
//            System.out.println("Found value: " + matcher.group(0));
//            System.out.println("Found value: " + matcher.group(1));
//            System.out.println("Found value: " + matcher.group(2));
//        } else {
//            System.out.println("NOT MATCH");
//        }
//    }
//    private static final String REGEX = "\\bcat\\b";
//    private static final String INPUT = "cat cat cat cattie cat";
//
//    public static void main(String[] args) {
//        Pattern p = Pattern.compile(REGEX);
//        Matcher m = p.matcher(INPUT);
//        int count = 0;
//
//        while (m.find()) {
//            count++;
//            System.out.println("Match number" + count);
//            System.out.println("start(): " + m.start());
//            System.out.println("end(): " + m.end());
//        }
//    }

}
