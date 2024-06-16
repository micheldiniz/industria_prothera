package io.gupy.prothera.teste.modelo;

import java.math.BigDecimal;
import java.math.MathContext;
import java.time.LocalDate;
import java.util.Objects;

public class Funcionario extends Pessoa{
	
	private BigDecimal salario;
	private String funcao;
	
	public Funcionario(String nome, LocalDate dataNascimento) {
		super(nome, dataNascimento);
	}
	
	public Funcionario(String nome, String dataNascimento, String salario, String funcao) {
		super(nome, dataNascimento);
		this.salario = new BigDecimal(salario);
		this.funcao = funcao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(funcao, salario);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		return Objects.equals(funcao, other.funcao) && Objects.equals(salario, other.salario);
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
		
	public String getSalario() {		
	  String salario = this.salario.toString();
	  String[] valores = salario.split("\\.");
	  String subs = valores[0]; 

   	  subs = subs.replaceAll("(\\d+)(\\d{3})$", "$1.$2");
	  	  
	  return subs+","+valores[1];
	}

	public void setSalario(BigDecimal salario) {		
		this.salario = salario;
	}

	public void aumentaSalarioPercentual(BigDecimal aumento) {		
		BigDecimal valorAumento = this.salario.multiply(aumento);
		this.salario = this.salario.add(valorAumento);		
	}
	
	@Override
	public String toString() {
		return "Funcionario [nome=" + this.getNome() + ", funcao=" + funcao + ", salario=" + this.getSalario() + ", data nascimento=" + this.getDataNascimento() + "]";
	}



	
	
}
