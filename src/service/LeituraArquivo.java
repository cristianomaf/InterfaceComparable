package service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Funcionario;

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
		List<Funcionario> list = new ArrayList<>();  //lista
	
		try(BufferedReader br = new BufferedReader(new FileReader(camArq))) {
			String funcionarioCsv = br.readLine(); //variavel que le as linhas do arquivo funcionario csv
			
			while(funcionarioCsv!= null) {  //enquanto funcinarios for diferente de vazio
				
				//***cria um vetor que cada expressao do arquivo fica em uma posicao do vetor(no caso um campo é indicado pelo separador virgula, cada virgula encontrada separa um campo 
				String [] campos = funcionarioCsv.split(",");
				
				list.add(new Funcionario(campos[0], Double.parseDouble(campos[1])));   // adiciona nome na lista
				funcionarioCsv = br.readLine(); // le a proxima linha
			}
			
			Collections.sort(list);   //organiza lista
			for(Funcionario emp: list) {      //passa pela lista toda
				System.out.println(emp.getNome()+ ","+ emp.getSalario());  //imprimindo resultados
			} 
			
		}catch (IOException e) {
			System.out.println("Erro: "+e.getMessage());
		}
		
	}
	
}
