package threads;

/* Simulação de geração de relatório + barra de tarefa SEM utilização de threads.
 
 */
public class Programa {
	public static void main(String[] args) {
				
		BarraDeProgresso barra = new BarraDeProgresso();
		barra.executa(); 
		
		GeraRelatorio relatorio = new GeraRelatorio();
		relatorio.executa(); 


	}
}