package application;

import java.util.Scanner;

import service.LeituraArquivo;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Entre com o caminho do arquivo de nomes: ");
		String caminhoDoArquivo = scan.nextLine();
		
		//instanciando leitura arquivo
		LeituraArquivo a1 = new LeituraArquivo(caminhoDoArquivo);
		//metodo de leitura da classe
		a1.LeituraArq(caminhoDoArquivo);
		
		
		scan.close();

	}

}
