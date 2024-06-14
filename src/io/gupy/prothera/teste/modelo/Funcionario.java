package io.gupy.prothera.teste.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario extends Pessoa{
	
	public Funcionario(String nome, LocalDate dataNascimento) {
		super(nome, dataNascimento);
		// TODO Auto-generated constructor stub
	}

	private BigDecimal salario;
	private String funcao;
}
