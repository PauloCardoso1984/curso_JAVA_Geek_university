package object;
/* Object: A mãe de todas as classes

A classe Object, faz parte do pacote java.lang
 
 
 */

public class Programa { 
	
	public static void main(String[] args) {
		Cliente cl1 = new Cliente("Paulo Cardoso" , "Rua 10");
		Cliente cl2 = new Cliente("Reginaldo Cardoso" , "Rua 12");
		Cliente cl3 = new Cliente("Reginaldo Cardoso" , "Rua 15");
		
		Conta c1 = new Conta(1, 200, 600, cl1);
		Conta c2 = new Conta(2, 1200, 1600, cl2);
		Conta c3 = new Conta(2, 10000, 11600, cl3);
		
		// INSTANCIANDO A CLASSE Caixa
		Caixa prateleira = new Caixa();
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		System.out.println();
		
		// FAZENDO COMPARAÇÃO DE CONTAS
		if (c1 == c2) {
			System.out.println("É a mesma conta...");
		} else {
			System.out.println("São contas diferentes...");
		}		
		System.out.println();
		
		// FAZENDO DE OUTRA FORMA
		if (c1.equals(c2)) {
			System.out.println("É a mesma conta...");
		} else {
			System.out.println("São contas diferentes...");
		}		
		System.out.println();
		
		if (c1.equals(c1)) {
			System.out.println("É a mesma conta...");
		} else {
			System.out.println("São contas diferentes...");
		}
		System.out.println();
		
		if (c2.equals(c3)) {
			System.out.println("É a mesma conta...");
		} else {
			System.out.println("São contas diferentes...");
		}
		
		if (c1 instanceof Conta) {
			System.out.println("O objeto é do tipo Conta.");
		}
				
		System.out.println();
		
		prateleira.adicionar(c1);
		prateleira.adicionar(c2);
		
		Conta conta1 = ((Conta)prateleira.pegar(0));  // CASTING
		System.out.println(conta1);
		System.out.println(prateleira.pegar(0)); // OUTRA FORMA DE PEGAR AS INFORMAÇÕES
		
		System.out.println();
		
		Conta conta2 = ((Conta)prateleira.pegar(1));  // CASTING
		System.out.println(conta2);
		System.out.println(prateleira.pegar(1)); // OUTRA FORMA DE PEGAR AS INFORMAÇÕES
			
	}
}