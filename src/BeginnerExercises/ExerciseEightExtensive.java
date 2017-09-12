package BeginnerExercises;

import java.util.Map;
import java.util.HashMap;
import java.util.Deque;
import java.util.LinkedList;

public class ExerciseEightExtensive extends ExerciseEightExpression {
	private Map<String, String> map = new HashMap<String,String>();

	{
		map.put("1","");
		map.put("2","mil ");
		map.put("2s","mil ");
		map.put("3","milh�o ");
		map.put("3s", "milh�es ");
		map.put("4","bilh�o ");
		map.put("4s","bilh�es ");
		map.put("5","trilh�o ");
		map.put("5s","trilh�es ");
	}
	
	public String interpret(String number){
		String extensoParteInteira="";
		String extensoParteDecimal="";
		String parteInteira="";
		String parteDecimal="";		

		//1� separa a parte decimal da parte inteira do n�mero
		int floatPosition = number.indexOf(".");
		
		// Numero com parte inteira e decimal: 1.21
		if (floatPosition > 0) {
			parteInteira = number.substring(0, floatPosition);
			
			//2� retorna o valor por extenso da parte inteira
			extensoParteInteira = interpretaNumero(parteInteira);

			//3� retorna o valor decimal por extenso
			parteDecimal = number.substring(floatPosition+1);
			parteDecimal = this.left(parteDecimal,2);
			if (parteDecimal.length() == 1) parteDecimal+="0";
			extensoParteDecimal = interpretaNumero(parteDecimal);
		}

		// Numero apenas com parte decimal: .21
		if (floatPosition == 0){
			//3� retorna o valor decimal por extenso
			parteDecimal = number.substring(floatPosition+1);
			parteDecimal = this.left(parteDecimal,2);
			if (parteDecimal.length() == 1) parteDecimal+="0";
			extensoParteDecimal = interpretaNumero(parteDecimal);
		}

		// Numero sem parte decimal: 121
		if (floatPosition < 0) {
			parteInteira = number;
			
			//2� retorna o valor por extenso da parte inteira
			extensoParteInteira = interpretaNumero(parteInteira);
		}

		extensoParteInteira = extensoParteInteira.trim();
		extensoParteDecimal = extensoParteDecimal.trim();
			
		String Reais = (extensoParteInteira.equals(""))?"":" Reais";
		String Centavos = (extensoParteDecimal.equals(""))?"":" Centavos";		

		//4� concatena e retorna resultado
		return extensoParteInteira + Reais + ((extensoParteInteira.equals(""))?"":" ") + extensoParteDecimal + Centavos;
	}	
	


	private String interpretaNumero(String number){
		String extenso ="";

		//number = "1456654123111";

		Deque<String> numbers = new LinkedList<String>();
		
		// separa o grande n�mero em [###]
		for(int i = number.length(); i > 0; i-=3){
			int n = i-3 < 0? 0:i-3;
			numbers.push(number.substring(n,i));
		}
		
		
		String subNumber = null;
		while(numbers.size() > 0){
			Integer i = numbers.size();
			subNumber = numbers.pop();
			//System.out.println(subNumber);

			//Expression ex = DigitoFactory.get(subNumber.length());
			ExerciseEightExpression ex = new ExerciseEightHundred();
			extenso += ex.interpret(subNumber) + " " + this.getFromMap(map,i.toString(), subNumber);
		}
		return extenso;
	}

	private String getFromMap(Map<String,String> map, String toGet, String value){
		String retorno = "";

		int val = Integer.parseInt(value);

		if (val == 0) return "";
		if(Integer.parseInt(value) > 1) toGet +="s";
		if ((retorno = map.get(toGet))==null) return "";
		
		return retorno;
	}
}
