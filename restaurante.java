import java.util.Scanner;
//Programa de simulação de restaurante.
public class Restaurante_Cher_Leoncio {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numero;
		
		do {
		System.out.println("Seja Bem Vindo ao Chez Leôncio.");
		System.out.println();
		System.out.println("Ecolha uma das 6 opções um lanche:\n1-Hamburguer.\n"
				+ "2-Salada de Frutas.\n3-Bolo de Cenoura c/ Chocolate.\n4-Baurú.\n"
				+ "5-Pastel de Carne.\n6-Vitamina de Abacate.");
		
		System.out.println("\nInforme um número que corresponde ao prato escolhido: ");
		numero = teclado.nextInt();
		
		switch(numero) {
		case 1:
			numero = 1;
			break;
		case 2: 
			numero = 2;
			break;
		case 3:
			numero = 3;
			break;
		case 4:
			numero = 4;
			break;
		case 5:
		    numero = 5;
		    break;
		case 6:
			numero = 6;
			break;
		}
		
		System.out.println("O prato escolhido foi: " + numero);
		
		if (numero == 1) {
			System.out.println("Hamburguer");
			System.out.println("Seu prato foi escolhido com sucesso, agradecemos"
					+ " a preferência.");
			
		} else if (numero == 2) {
			System.out.println("Salada de Frutas");
			System.out.println("Seu prato foi escolhido com sucesso, agradecemos"
					+ " a preferência.");
			
		} else if (numero == 3) {
			System.out.println("Bolo de Cenoura c/ Chocolate");
			System.out.println("Seu prato foi escolhido com sucesso, agradecemos"
					+ " a preferência.");
			
		} else if (numero == 4) {
			System.out.println("Baurú");
			System.out.println("Seu prato foi escolhido com sucesso, agradecemos"
					+ " a preferência.");
			
		} else if (numero == 5) {
			System.out.println("Pastel de Carne");
			System.out.println("Seu prato foi escolhido com sucesso, agradecemos"
					+ " a preferência.");
			
		} else if (numero == 6) {
			System.out.println("Vitamina de Abacate");
			System.out.println("Seu prato foi escolhido com sucesso, agradecemos"
					+ " a preferência.");
			
		} else {
			System.out.println("Número do cardápio incorreto! Não temos essa opção.");
		}
		
		}while (numero != 1 && numero != 2 && numero != 3 
				&& numero != 4 && numero != 5 && numero != 6);
	}	
}
