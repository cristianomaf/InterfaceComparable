package service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeituraArquivo {
	private String caminhoDoArquivo;
	
	//construtor
	public LeituraArquivo(String caminhoDoArquivo) {
		this.caminhoDoArquivo = caminhoDoArquivo;
	}

	
	//getters e setters
	public String getCaminhoDoArquivo() {
		return caminhoDoArquivo;
	}

	public void setCaminhoDoArquivo(String caminhoDoArquivo) {
		this.caminhoDoArquivo = caminhoDoArquivo;
	}
	
	// metodo leitura
	
	public void LeituraArq(String camArq) {
		List<String> list = new ArrayList<>();  //lista
	
		try(BufferedReader br = new BufferedReader(new FileReader(camArq))) {
			String nome = br.readLine(); // variavel nome recebe nomes de cada linha do arquivo que contera apenas nomes
			
			while(nome != null) {  //enquanto nome for diferente de vazio
				list.add(nome);   // adiciona nome na lista
				nome = br.readLine(); // le a proxima linha
			}
			Collections.sort(list);   //organiza lista
			for(String s : list) {      //passa pela lista toda
				System.out.println(s);  //imprimindo resultados
			} 
			
		}catch (IOException e) {
			System.out.println("Erro: "+e.getMessage());
		}
		
	}
	
}
