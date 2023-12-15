package templeteMethod;
/*
 * Template Method -> é o pradrão que define o esqueleto de um algoritmo dentro de um método,
 * transferindo alguns de seus passos para as subclasses. O template Method permite
 * que as subclasses redefinam certos pasoos de um algoritmo sem alterar a estrutura
 * do proprio algoritmo. 
 * 
 * metodo principal(){
  	passo1();
  	passo2();
  	passo3();
  }
*/
public class Programa {
	public static void main(String[] args) {
		
		TreinamentoInicioDaTemporada tit = new TreinamentoInicioDaTemporada();
		tit.treinoDiario();
		
		System.out.println();
		
		TreinamentoFimDaTemporada tft = new TreinamentoFimDaTemporada();
		tft.treinoDiario();
		
	}
}
