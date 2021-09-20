package kassio;

import java.util.stream.IntStream;

public class Stream {
  public static void main(String[] args) throws Exception {


    IntStream.range(0, 10)
      .reduce((n1, n2) -> n1 + n2)
      .ifPresent(System.out::println);


    IntStream.range(0, 10)
      .filter(n -> n % 2 == 1)
      .reduce((n1, n2) -> n1 + n2)
      .ifPresent(System.out::println);
  }
}