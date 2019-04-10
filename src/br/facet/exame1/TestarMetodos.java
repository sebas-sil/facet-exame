package br.facet.exame1;

import java.text.ParseException;

public class TestarMetodos {
	
	public static void main(String[] args) throws ParseException {
		
		Aluno teste = new Aluno();
		
		teste.setDataDeNascimento("11/04/1984");
		
		int aula = teste.falarIdade();
		
		System.out.println(aula);
	}

}
