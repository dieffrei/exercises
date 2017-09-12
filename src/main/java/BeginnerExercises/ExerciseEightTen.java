package main.java.BeginnerExercises;

import java.util.Map;
import java.util.HashMap;

	public class ExerciseEightTen extends ExerciseEightExpression {

		private ExerciseEightExpression ex = new ExerciseEightUnit();
		
		private Map<String, String> map = new HashMap<String,String>();
		{
			map.put("1","dez");
			map.put("11","onze");
			map.put("12","doze");
			map.put("13","treze");
			map.put("14","quatorze");
			map.put("15","quinze");
			map.put("16","dezesseis");
			map.put("17","dezessete");
			map.put("18","dezoito");
			map.put("19","dezenove");		

			map.put("2","vinte");
			map.put("3","trinta");
			map.put("4","quarenta");
			map.put("5","cinquenta");
			map.put("6","sessenta");
			map.put("7","setenta");
			map.put("8","oitenta");
			map.put("9","noventa");	
		}
		public String interpret(String number){
			String resposta = null;


			// verifica se o n�mero possui pelo menos 2 casas
			if (number.length() < 2){
				// se o n�mero possuir menos de duas casas ent�o passa para Unidade avaliar.
				resposta = ex.interpret(number);
			} else {

				// pega os dois digitos a esquerda do n�mero passado: Ex: 23 --> (23)
				String numeroComDoisDigitos = this.left(number,2);
				
				// se n�o houver uma entrada correspondente no map ao n�mero de dois digitos...
				if ((resposta = this.getFromMap(map, numeroComDoisDigitos)).equals("")){

					// ... tentamos s� com um digito. Ex: 23 --> (2)3
					String primeiroDigito = this.left(number,1);
					resposta = this.getFromMap(map, primeiroDigito);

					// Pega a string remanescente. EX: 23 --> 2(3)
					String remanescente = this.right(number,1);
					
					String unidade = ex.interpret(remanescente);
					if (unidade.equals("") || resposta.equals("")){
						resposta += unidade;
					} else {
						resposta += " e " + unidade;
					}
				}			
			}
			return resposta;	
		}
		
	}
