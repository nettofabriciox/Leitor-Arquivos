package aplicativo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import leitorarquivo.Produtos;
import leitorarquivo.ServicoCalculador;

public class Programa {

	public static void main(String[] args) {
		
		List<Produtos> lista = new ArrayList<>();
		
		String caminho = "C:\\Users\\agost\\OneDrive\\Documentos\\in.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(caminho))){
			
			String linha = br.readLine();
			while(linha != null) {
				String[] f = linha.split(",");
				lista.add(new Produtos(f[0], Double.parseDouble(f[1])));
				linha = br.readLine();
			}
			
			Produtos x = ServicoCalculador.max(lista);
			System.out.println("Max:");
			System.out.println(x);
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
