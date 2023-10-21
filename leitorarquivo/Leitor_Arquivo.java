package leitorarquivo;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Leitor_Arquivo {

	public static void main(String[] args) {
	
		File caminho = new File("C:\\Users\\agost\\OneDrive\\Documentos\\in.txt");
        Scanner sc = null;
        try {
        	sc = new Scanner(caminho);
        	while(sc.hasNextLine()) {
        		System.out.println(sc.nextLine());
        	}
        }
        catch(IOException e) {
        	System.out.println("Error: " + e.getMessage());
        }
        finally {
        	if(sc != null) {
        		sc.close();
        	}
        }
	}

}
