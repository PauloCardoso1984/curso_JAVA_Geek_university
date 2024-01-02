package object;

import java.util.Objects;

public class Cliente {
	String nome;
	String endereço;
	
	// CONSTRUTOR VAZIO
	public Cliente() {
	}

	// CONSTRUTOR COM ARGUMENTOS
	public Cliente(String nome, String endereço) {
		this.nome = nome;
		this.endereço = endereço;
	}

	@Override
	public String toString() {
		return "Cliente = " + nome + ", endereço = " + endereço;
	}

	// COMPARANDO O CLIENTE PELO NOME
	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(nome, other.nome);
	}		
}
