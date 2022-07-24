package map.exercicio.proposto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Na contagem de votos de uma eleição, são gerados vários registros de votação
 * contendo o nome do candidato e a quantidade de votos (formato.csv) que ele
 * obteve em uma urna de votação. Você deve fazer um programa para ler os registros
 * de votação a partir de um arquivo e daí gerar um relatório consolidado com os 
 * totais de cada candidato.
 */
public class Program {
	public static void main(String[] args) {
		Map<String, Integer> votes = new LinkedHashMap<>();
						
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter file full path: ");
			String path = sc.next();

			try (BufferedReader br = new BufferedReader(new FileReader(path))) {
				String line = br.readLine();

				while (line != null) {
					String[] fields = line.split(",");
					String name = fields[0];
					Integer count = Integer.parseInt(fields[1]);
					
					if (votes.containsKey(name)) {
						int votesSoFar = votes.get(name);
						votes.put(name, count + votesSoFar);
					} else {
						votes.put(name, count);
					}
					
					line = br.readLine();
				}

				for (Map.Entry<String, Integer> entry : votes.entrySet()) {
					System.out.println(entry.getKey() + ": " + entry.getValue());
				}
				
			} catch (IOException e) {
				System.out.println("ERROR: " + e.getMessage());
			}
		}
	}
}
