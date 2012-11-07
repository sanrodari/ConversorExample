package com.example.conversor;
public class Conversor {

	private long convertirBaseADecimal(String numeroConvertir, int base) {

		long resultado = 0;

		int numeroDigitos = numeroConvertir.length();
		for (int i = 0; i < numeroDigitos; i++) {
			int digito;
			String digitoString = "" + numeroConvertir.charAt(i);
			if(digitoString.equalsIgnoreCase("a")) {
				digito = 10;
			}
			else if(digitoString.equalsIgnoreCase("b")) {
				digito = 11;
			}
			else if(digitoString.equalsIgnoreCase("c")) {
				digito = 12;
			}
			else if(digitoString.equalsIgnoreCase("d")) {
				digito = 13;
			}
			else if(digitoString.equalsIgnoreCase("e")) {
				digito = 14;
			}
			else if(digitoString.equalsIgnoreCase("f")) {
				digito = 15;
			}
			else {
				digito = Integer.parseInt(digitoString);
			}
			int potencia = numeroDigitos - i - 1;

			resultado += (digito * Math.pow(base, potencia));
		}

		return resultado;
	}

	public long convertirBinarioADecimal(String binario) {
		return convertirBaseADecimal(binario, 2);
	}

	public long convertirOctalADecimal(String octal) {
		return convertirBaseADecimal(octal, 8);
	}

	public long convertirHexadecimalADecimal(String hexadecimal) {
		return convertirBaseADecimal(hexadecimal, 16);
	}

}