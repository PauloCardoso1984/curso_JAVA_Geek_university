package threads;

public class BarraDeProgresso {
	
	public void executa() {
		
		// Fazer um For de número de 0 até 10 mil 
		for (int i = 0; i < 10000; i ++) {
			System.out.println("Barra de Progresso... aguarde " + (i + 1));
		}
	}
}
