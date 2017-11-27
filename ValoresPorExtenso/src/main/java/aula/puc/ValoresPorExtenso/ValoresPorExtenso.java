package aula.puc.ValoresPorExtenso;

public class ValoresPorExtenso {

	public String valorPorExtenso (Float valor){
		String resultado = "";
		
		if (valor < 0 || valor > 999){
			return "Valor Inválido";
		}
		
		if (valor >= 900 ){
			resultado = resultado + "Novecentos";
		}else if (valor >= 800){
			resultado = resultado + "Oitocentos";
		}else if (valor >= 700){
			resultado = resultado + "Setecentos";
		}else if (valor >= 600){
			resultado = resultado + "Seiscentoss";
		}else if (valor >= 500){
			resultado = resultado + "Quinhentos";
		}else if (valor >= 400){
			resultado = resultado + "Quatrocentos";
		}else if (valor >= 300){
			resultado = resultado + "Trezentos";
		}else if (valor >= 200){
			resultado = resultado + "Duzentos";
		}else if (valor >= 100){
			resultado = resultado + "Cento";
		}
		
		
		if (valor >= 100){ 
			resultado = resultado + " e ";
			valor = valor % 100;}	
		
		if (valor >= 90 ){
			resultado = resultado + "Noventa";
		}else if (valor >= 80){
			resultado = resultado + "Oitenta";
		}else if (valor >= 70){
			resultado = resultado + "Setenta";
		}else if (valor >= 60){
			resultado = resultado + "Sescenta";
		}else if (valor >= 50){
			resultado = resultado + "Cinquenta";
		}else if (valor >= 40){
			resultado = resultado + "Quarenta";
		}else if (valor >= 30){
			resultado = resultado + "Trinta";
		}else if (valor >= 20){
			resultado = resultado + "Vinte";
		}else if (valor == 19){
			return resultado + "Dezenove";
		}else if (valor == 18){
			return resultado + "Dezoito";
		}else if (valor == 17){
			return resultado + "Dezessete";
		}else if (valor == 16){
			return resultado + "Dezesseis";
		}else if (valor == 15){
			return resultado + "Quinze";
		}else if (valor == 14){
			return resultado + "Quatorze";
		}else if (valor == 13){
			return resultado + "Treze";
		}else if (valor == 12){
			return resultado + "Doze";
		}else if (valor == 11){
			return resultado + "Onze";
		}else if (valor == 10){
			return resultado + "Dez";
		}
		
		if (valor % 10 > 0){ 
			resultado = resultado + " e ";
			valor = valor % 10;}
		
		if (valor == 9){
			return resultado + "Nove";
		}else if (valor == 8){
			return resultado + "Oito";
		}else if (valor == 7){
			return resultado + "Sete";
		}else if (valor == 6){
			return resultado + "Seis";
		}else if (valor == 5){
			return resultado + "Cinco";
		}else if (valor == 4){
			return resultado + "Quatro";
		}else if (valor == 3){
			return resultado + "Três";
		}else if (valor == 2){
			return resultado + "Dois";
		}else if (valor == 1){
			return resultado + "Um";
		}	
			
		return resultado;
	}
	
}
