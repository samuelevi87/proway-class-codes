package br.com.proway.senior.samuel;

public class Class20210412 {

	public static void main(String[] args) {
		int arg1 = 6;
		if (arg1 == 0) {
			System.out.println("Arg1 = " + arg1);
		} else if (arg1 == 1) {
			System.out.println("Arg1 = " + arg1);
		} else if (arg1 == 2) {
			System.out.println("Arg1 = " + arg1);
		} else if (arg1 == 3) {
			System.out.println("Arg1 = " + arg1);
		} else if (arg1 == 4) {
			System.out.println("Arg1 = " + arg1);
		} else if (arg1 == 5) {
			System.out.println("Arg1 = " + arg1);
		} else {
			System.out.println("Valor diferente do esperado");
		}

		char[][] ab = new char[5][5];
		for (int i = 0; i < ab.length; i++) {
			char[] linha = new char[5];
			for (int j = 0; j < linha.length; j++) {
				if (j == 2 && i == 2) break;
				if (j == 2 && i == 2) continue;
				linha[j] = 's';
			}
			ab[i] = linha;
		}
		for(char[] printLinha : ab) {
			for (char ch:printLinha) {
				System.out.println(ch);
				System.out.println(" ");
			}
			System.out.println("\n");
		}

	}

}
