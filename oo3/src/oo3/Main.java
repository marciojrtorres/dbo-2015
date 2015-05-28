package oo3;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {

		Pessoa pedro = new Pessoa("Pedro");
		Pessoa maria = new Pessoa("Maria");
		
		Pessoa luciano = new Pessoa("Luciano");
		Pessoa raquel = new Pessoa("Raquel");
		Pessoa leonardo = new Pessoa("Leonardo");
		Pessoa alaides = new Pessoa("Alaides");
		
		pedro.casaCom(maria);
				
		System.out.println(pedro.getConjuge());		
		System.out.println(maria.getConjuge());
		
		maria.addDependente(luciano);
		maria.addDependente(raquel);
		
		System.out.println(Arrays.toString(maria.getDependentes()));
		System.out.println(maria.getDependentes().length);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}