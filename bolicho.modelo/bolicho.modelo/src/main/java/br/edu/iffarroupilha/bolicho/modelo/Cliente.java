package br.edu.iffarroupilha.bolicho.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity /* este e todo comando com @ � vinculado ao hibernate e faz liga��o com o banco de dados*/
public class Cliente {
	@Id
	@Column(nullable=false)
	private int cpf;
	@Column(length=40, nullable=false)
	private String nome;
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
