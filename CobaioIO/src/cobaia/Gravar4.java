package cobaia;

import java.io.File;
import java.io.FileWriter;
import java.util.Date;

public class Gravar4 {

	public static void 
		main(String[] args) throws Exception {
		
		// banco.csv 
		File alunos = new File("alunos.csv");
		// Comma Separated Values
		// Valores Separados por Vírgula
		// Ex.:
		// 11030226;Ana Flávia;Moraes;02/07/1999
		
		FileWriter writer = 
				new FileWriter(alunos, true);
		
		Aluno a = new Aluno();
		a.setMatricula(11030226);
		a.setNome("Ana Flávia");
		a.setSobrenome("Moraes");
		a.setDataNascimento(new Date("07/02/1999"));
		
		writer.append(a.toCSV() + "\n");
		
		Aluno a2 = new Aluno();
		a2.setMatricula(11030216);
		a2.setNome("Sarah Janaina");
		a2.setSobrenome("Black");
		a2.setDataNascimento("25/03/1999");
		
		writer.append(a2.toCSV() + "\n");
		
		writer.flush();
		writer.close();
		
		System.out.println("0k");

	}

}
