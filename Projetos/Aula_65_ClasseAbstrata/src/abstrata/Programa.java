package abstrata;
/*
 * ABSTRATA - Proporciona um bloqueio na criação de objetos

*/

public class Programa {
	public static void main(String[] args) {
		
		System.out.println("Pessoa");
		Aluno paulo = new Aluno("Paulo Cardoso", 1984, "123456");
		System.out.println(paulo);
		
		// MENSAGEM VINDO DA CLASSE PESSOA - CLASE ABSTRATA
		paulo.mensagem("Esse é um professor...");
		
	}
}
