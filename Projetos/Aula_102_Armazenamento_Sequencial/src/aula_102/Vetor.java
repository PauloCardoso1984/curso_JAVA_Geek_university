package aula_102;

import java.util.Arrays;

public class Vetor {
		
	private Aluno alunos[] = new Aluno [100]; // ARRAY DE ALUNO QUE IRÁ NESTE CASO ATÉ 100
	private int total = 0;
	
	// CONSTRUÇÃO COM ARGUMENTOS
	public Vetor(Aluno[] aluno) {
		this.alunos = aluno;
	}

	public Vetor() {
	}

	// MÉTODO PARA ADICIONAR ALUNO
	// 1ª FORMA
/*	public void adiciona(Aluno aluno) {
		for (int i=0; i < alunos.length; i++) {
			if(alunos[i] == null) {
				alunos[i] = aluno;
				break;
			}
		}
	}
*/
	// 2ª FORMA
	public void adiciona(Aluno aluno) {
		this.alunos[total] = aluno;
		total = total + 1;
	}
	
	// METODO QUE COLOCA O ALUNO EM DETERMIANDA POSIÇÃO (DE TRÁS PARA FRENTE = FINAL DA FILA)
	public void adiciona(int posicao, Aluno aluno) {
		for (int i = total - 1; i >= posicao; i-=1) {
			alunos [i + 1] = alunos[i];
		}
		alunos[posicao] = aluno;
		total++;
	}
	
	
	// METODO PARA VERIFICAR A POSIÇÃO DO ALUNO
	public Aluno pega(int posicao) {
		if (!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição inválida.");
		}
		return this.alunos[posicao];
	}
	
	// METODO PARA REMOVER UM ALUNO
	public void remove(int posicao) {
		this.alunos[posicao] = null;
	}
	
	// METODO QUE VERIFICA SE O ALUNO ESTÁ NA LISTA
	public boolean contem(Aluno aluno)	{
		for (int i = 0; i < total; i++ ) {
			if(aluno.equals(alunos[i])) {
				return true;
			}
		}
		return false;
	}
	
	// METODO QUE DEVOLVE A QUANTIDADE DE ALUNOS NO ARRAY
	public int tamanho() {
		return this.total;
	}

	// MÉTODO toString
	@Override
	public String toString() {
		return Arrays.toString(alunos);
	}
	
	// METODO AUXILIAR PARA O METODO PEGA
	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < total;
	}	
}
	

