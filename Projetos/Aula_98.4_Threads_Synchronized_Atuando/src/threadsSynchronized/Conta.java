package threadsSynchronized;

import java.util.Objects;

public class Conta {
	private int numero;
	private float saldo;
	private float limite;
	private Cliente cliente; // Esse atributo só é possivel porque existe a classe cliente
	
	// CONSTRUTOR COM ARGUMENTOS
	public Conta(int numero, float saldo, float limite, Cliente cliente) {
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
		this.cliente = cliente;
	}
	
	public Conta() {
	}
	
	// Get e Set
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	// MÉTODOS
	// SAQUE
	void sacar(float valor) {
		// REGRA DE NEGÓCIO
		if(valor <= this.saldo) {
			this.saldo = this.saldo - valor;
		}
		else if (valor <= this.saldo + this.limite) {
			// CALCULANDO O VALOR EXCEDENTE DO SAQUE
			float val_ret = this.saldo - valor;
			if(val_ret < 0) {
				this.saldo = 0;
			}
			val_ret = this.limite + val_ret;
			this.limite = val_ret;
		}else {	
			System.out.println("Saldo insuficiente");
		}
	}
	// DEPÓSITO
	void depositar(float valor) {
		this.saldo = this.saldo + valor;
	}
	
	// RETORNAR O SALDO
	public float getSaldo() {
		return this.saldo + this.limite;
	}

	@Override
	public String toString() {
		return "Conta = " + numero + ", Saldo = " + saldo + ", Limite = " + limite +  ", " + cliente;
	}

	// Equals 

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Conta)) {
			return false;
		} else {
			Conta verificar = (Conta) obj; // CASTING
			return verificar.getCliente() == this.getCliente();
		}
	}
}
	

