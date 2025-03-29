package Questions;
import java.util.*;
import java.util.stream.*;


public class CountAnagramUsingJava8 {
    public static void main(String[] args) {
      String s[]={"Hello","world","heoll","hlole","dlr","dlrow"};
      Arrays.stream(s).collect(Collectors.groupingBy(s1-> s1.chars().sorted().mapToObj(c-> String.valueOf((char) c)).collect(Collectors.joining()).toString(),Collectors.counting())).forEach((k,v)->System.out.println(k+" "+v));
  }
}
