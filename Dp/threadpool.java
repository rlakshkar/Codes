import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
      String s[]={"Hello","world","heoll","hlole","dlr","dlrow"};
      Arrays.stream(s).collect(Collectors.groupingBy(s-> s.chars.sorted().collect(Collectors.joining()).toString(),Collectors.counting())).forEach((k,v)->System.out.println(k+" "+v));
  }
}
