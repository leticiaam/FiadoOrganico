package fiado;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("informe o nome do cliente: ");
		String nome = scanner.nextLine();

		System.out.print("informe o telefone do cliente: ");
		String telefone = scanner.nextLine();

		Consumidor consumidor = new Consumidor(nome, telefone);

		System.out.print("Informe o valor da compra: ");
		int fiado = Integer.valueOf(scanner.nextLine());
		consumidor.registrarFiado(fiado);

		int total = consumidor.getFiado();

		if (total > 100) {
			System.out.println("Cliente " + consumidor.getNome() + " deve: " + total + " GANHOU BRINDE");
		} else {
			System.out.println("Cliente " + consumidor.getNome() + " deve: " + total + " NÃO GANHOU BRINDE");
		}
	}

	public static int somaWhile(int[] fiados) {
		int i = 0;
		int total = 0;
		while (i < fiados.length) {
			total += fiados[i];
			i++;
		}
		return total;
	}

//		public static int somaFor(int[] fiados) {
//		int total = 0;
//		for (int i=0; i < fiados.length; i++) {
//			total += fiados [i];
//		}
//	return total;
//	}
//	public static int somaForeach(int[] fiados) {
//		int total = 0;
//		for (int fiado : fiados) {
//			total += fiado;
//		}
//		return total;
//}	
}
