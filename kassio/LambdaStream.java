package kassio;

import java.util.Arrays;
import java.util.List;

public class LambdaStream {
  public static void main(String[] args) throws Exception {

    List<Integer> exemplo2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    //Uso do lambda
    exemplo2.stream()
      .filter(n -> n % 2 == 0)
      .forEach(n -> System.out.println(n));

    //Uso do lambda com stream
    exemplo2.stream()
      .filter(n -> n % 2 == 0)
      .forEach(System.out::println);
  }
}
