package io.gupy.prothera.teste;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import io.gupy.prothera.teste.modelo.Funcionario;

public class Principal {

	public static void main(String[] args) {
		
		Funcionario maria = new Funcionario("Maria", "18/10/2000","2009.44","Operador");
		Funcionario joao = new Funcionario("João", "12/05/1990","2284.83","Operador");
		Funcionario caio = new Funcionario("Caio", "02/05/1961","9836.14","Coordenador");
		Funcionario miguel = new Funcionario("Miguel", "14/10/1988","1919.88","Diretor");
		Funcionario alice = new Funcionario("Alice", "05/01/1995","2234.68","Recepcionista");
		Funcionario heitor = new Funcionario("Heitor", "19/11/1999","1582.72","Operador");
		Funcionario arthur = new Funcionario("Arthur", "31/03/1993","4071.84","Contador");
		Funcionario laura = new Funcionario("Laura", "08/07/1994","3017.45","Gerente");
		Funcionario heloisa = new Funcionario("Heloísa", "24/05/2003","1606.85","Eletricista");
		Funcionario helena = new Funcionario("Helena", "02/09/1996","2799.93","Gerente");
		
		List<Funcionario> lista = Arrays.asList(maria,joao,caio, miguel,alice,heitor,arthur,laura,heloisa,helena);
		List<Funcionario> funcionarios = new ArrayList<Funcionario>(lista);
		
		int indexJoao = funcionarios.indexOf(new Funcionario("João", "12/05/1990","2284.83","Operador"));
				
		if(indexJoao > 0) {
			funcionarios.remove(indexJoao);
		}		
		
		funcionarios.forEach(p -> {
			System.out.println(p);
		});
	}

}
