package io.gupy.prothera.teste.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class Funcionario extends Pessoa{
	
	private BigDecimal salario;
	private String funcao;
	
	public Funcionario(String nome, LocalDate dataNascimento) {
		super(nome, dataNascimento);
	}
	
	public Funcionario(String nome, String dataNascimento, double salario, String funcao) {
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

	@Override
	public String toString() {
		return "Funcionario [nome=" + this.getNome() + ", funcao=" + funcao + ", salario=" + salario + ", data nascimento=" + this.getDataNascimento() + "]";
	}



	
	
}
