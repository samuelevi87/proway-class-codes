package br.com.proway.senior.samuel;

public class MyClass {
//	comentário de uma linha
	public static void main(String[] args) {

		String name = "Samuel";
		var surname = "Levi";

		System.out.println(name + " " + surname);

//		char matriz[][] = new char[5][5];
		String[][] matriz = new String[5][5];
		for (byte i = 0; i < matriz.length; i++) {
			int tamanho = matriz[i].length;
			String[] linha = new String[tamanho];
			for (byte j = 0; j < linha.length; j++) {
				String item = " item" + String.valueOf(i) + String.valueOf(j);
				matriz[i][j] = item;
			}
		}
		for (String[] linha : matriz) {
			for (String coluna : linha) {
				System.out.print(coluna);
			}
			System.out.print("\n");
		}
	}
}
