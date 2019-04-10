package br.facet.exame1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;

public class Pessoa {
	
	private String nome;
	private String dataDeNascimento;
	private String cpf;
	
	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int falarIdade() throws ParseException {
		
		SimpleDateFormat convert = new SimpleDateFormat("dd/MM/yyyy");
		
		Date classData = new Date();
		
		classData = convert.parse(dataDeNascimento);
		
		Calendar data = Calendar.getInstance();  
		data.setTime(classData);  
		Calendar today = Calendar.getInstance();  
		int age = today.get(Calendar.YEAR) - data.get(Calendar.YEAR);  
		if (today.get(Calendar.MONTH) < data.get(Calendar.MONTH)) {
		  age--;  
		} else if (today.get(Calendar.MONTH) == data.get(Calendar.MONTH)
		    && today.get(Calendar.DAY_OF_MONTH) < data.get(Calendar.DAY_OF_MONTH)) {
		  age--;  
		}
		return age;
	}
		
	
	

}
