package kassio;

import java.util.Arrays;
import java.util.List;

public class Lambda {
  public static void main(String[] args) throws Exception {

    
    List<Integer> exemplo1 = Arrays.asList(10, 20, 30, 40, 50);

    //Imprime os valores com o uso do lambda
    exemplo1.forEach(ex -> System.out.println(ex));

    //Imprime os valores sem o uso do lambda
    for (Integer ex : exemplo1 ) {
     System.out.println(ex);
    }

  }
}