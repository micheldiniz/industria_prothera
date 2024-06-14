package io.gupy.prothera.teste.modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Pessoa {

	private String nome;
	private LocalDate dataNascimento;
	
	public Pessoa(String nome, LocalDate dataNascimento) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}
	
	public Pessoa(String nome, String dataNascimento) {		
		this.nome = nome;
		DateTimeFormatter padrao_data = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.dataNascimento = LocalDate.parse(dataNascimento, padrao_data);
	}

	@Override
	public int hashCode() {
		return Objects.hash(dataNascimento, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(dataNascimento, other.dataNascimento) && Objects.equals(nome, other.nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		DateTimeFormatter padrao_data = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return dataNascimento.format(padrao_data);
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	
}
