
interface Matematica{
	void Soma(int a,int b);
}

public class ExemploIntrodutorio {	
	public static void main(String[] args) {
		Matematica Calculadora = (a, b) -> {System.out.println(a + b);};
		
		Calculadora.Soma(50, 70);	
	}

}
